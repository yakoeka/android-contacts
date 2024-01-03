package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T comparableItem);

    boolean equals(Object comparableItem);
}
