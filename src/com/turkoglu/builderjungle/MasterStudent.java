package com.turkoglu.builderjungle;

public class MasterStudent extends Student {

    private String specilisation;

    public MasterStudent(Builder builder) {
        super(builder);
        this.specilisation = builder.specilisation;
    }

    @Override
    public String toString() {
        return super.toString() + ", specilisation: " + this.specilisation;
    }

    public static Builder<?> builder() {
        return new MasterStudentBuilder();
    }

    public static class MasterStudentBuilder extends Builder {
        @Override
        public MasterStudentBuilder getThis() {
            return this;
        }
    }

    public abstract static class Builder<T extends Builder<T>>
            extends Student.Builder<T> {

        private String specilisation;

        @Override
        public T getThis() {
            return (T) this;
        }

        public T specilisation(String specilisation) {
            this.specilisation = specilisation;
            return this.getThis();
        }

        public MasterStudent build() {
            return new MasterStudent(this);
        }

    }

}
