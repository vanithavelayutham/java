class Sample
{
    public static void main(String[] args) {
        List<Person> persons=Arrays.asList(new Person("ani",21),new Person("vani",18),new Person("vani",99),new Person("azar",11));
        //Find Maximum value
        persons.stream().max(Comparator.comparing(Person::getName)).ifPresent(p->System.out.println("sort by alphabet order person max"+p));
}
}
