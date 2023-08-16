package domain.models;

public class Client {

    private Long id;

    private String name;

    private Integer tier;

    public Client(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }


}
