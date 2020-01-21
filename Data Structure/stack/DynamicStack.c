#include<stdio.h>
#include<stdlib.h>
#define MAX 3

struct ArrayStack {
    int top;
    int capacity;
    int *arr;
};

typedef struct ArrayStack Stack;

Stack* createStack() {
    Stack *st = malloc(sizeof(Stack));
    if(!st) {
        return NULL;
    }
    st->top = -1;
    st->capacity = MAX;
    st->arr = malloc(st->capacity * sizeof(int));
    return st;
}

void deleteStack(Stack* st) {
    if(st) {
        free(st->arr);
        free(st);
    }
}

void doubleStack(Stack *st) {
    st->capacity *= 2;
    st->arr = realloc(st->arr, st->capacity * sizeof(int));
}

void halfStack(Stack *st) {
    st->capacity /= 2;
    st->arr = realloc(st->arr, st->capacity * sizeof(int));
}

int isEmpty(Stack *st) {
    return (st->top == -1);
}

int isFull(Stack *st) {
    return (st->capacity-1 == st->top);
}

void pushStack(Stack *st, int data) {
    if(isFull(st)){
        doubleStack(st);
        printf("\nStack is Full: Double It %d", st->capacity);
    }
    st->arr[++st->top] = data;
}

int popStack(Stack *st) {
    if(isEmpty(st)) {
        printf("\nStack is Empty: Underflow");
        return -1;
    }
    if(st->capacity/2 == st->top) {
        halfStack(st);
        printf("\nStack is Redueced: Half It %d", st->capacity);
    }
    return st->arr[st->top--];
}

void dispalyStack(Stack *st) {

}

int main() {
    Stack *st = createStack();
    int n=0, data;
    while(n != 3) {
        printf("\nSelect Operation 1.push 2.pop 3.exit\n");
        scanf("%d", &n);
        switch(n) {
            case 1:
                printf("\nEnter data: ");
                scanf("%d", &data);
                pushStack(st, data);
                break;
            case 2:
                printf("\nPopped: %d", popStack(st));
                break;
            case 3:
                break;
        }
    }
    return 0;
}
