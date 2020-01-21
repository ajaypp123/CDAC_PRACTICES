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

int isEmpty(Stack *st) {
    return (st->top == -1);
}

int isFull(Stack *st) {
    return (st->capacity-1 == st->top);
}

void pushStack(Stack *st, int data) {
    if(isFull(st)){
        printf("\nStack is Full: Overflow");
        return;
    }
    st->arr[++st->top] = data;
}

int popStack(Stack *st) {
    if(isEmpty(st)) {
        printf("\nStack is Empty: Underflow");
        return -1;
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
    deleteStack(st);
    return 0;
}
