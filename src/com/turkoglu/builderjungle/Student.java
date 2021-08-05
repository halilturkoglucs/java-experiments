package com.turkoglu.builderjungle;

public class Student extends People {

    private String school;

    public Student(Builder builder) {
        super(builder);
        this.school = builder.school;
    }

    @Override
    public String toString() {
        return super.toString() + ", school: " + this.school;
    }

    public static Builder<?> builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder extends Builder {
        @Override
        public StudentBuilder getThis() {
            return this;
        }
    }

    public abstract static class Builder<T extends Builder<T>>
            extends People.Builder<T> {

        private String school;

        @Override
        public T getThis() {
            return (T) this;
        }

        public T school(String school) {
            this.school = school;
            return this.getThis();
        }

        public Student build() {
            return new Student(this);
        }

    }

}
