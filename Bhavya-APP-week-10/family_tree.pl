% Facts
parent(john, alice).
parent(mary, alice).
parent(robert, john).
parent(lucy, john).
parent(david, susan).

sibling(alice, david).  % Alice and David are siblings

male(john).
male(robert).
female(mary).

% Rules
grandparent(Grandparent, Grandchild) :-
    parent(Grandparent, Parent),
    parent(Parent, Grandchild).

ancestor(Ancestor, Person) :-
    parent(Ancestor, Person).
ancestor(Ancestor, Person) :-
    parent(Ancestor, Child),
    ancestor(Child, Person).

sibling_pair(X, Y) :-
    sibling(X, Y).

% Queries you can run:
% ?- grandparent(X, susan).         
% ?- grandparent(john, susan).      
% ?- ancestor(X, susan).            
% ?- sibling_pair(X, Y).            
