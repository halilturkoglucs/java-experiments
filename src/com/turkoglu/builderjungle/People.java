package com.turkoglu.builderjungle;

public class People {

    private String name;

    private int age;

    protected People(Builder<?> builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", age: " + this.age;
    }

    public static Builder builder() {
        return new Builder() {
            @Override
            public Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>> {

        private String name;

        private int age;

        public abstract T getThis();

        public T name(String name) {
            this.name = name;
            return (T) this.getThis();
        }

        public T age(int age) {
            this.age = age;
            return (T) this.getThis();
        }

        public People build() {
            return new People(this);
        }
    }

}
