package application.Model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "generos")
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String nome;
    
    @ManyToMany(mappedBy = "generos")
    private Set<Jogos> jogos = new HashSet<>();
    
    public Genero() {}
    
    public Genero(String nome) {
        this.nome = nome;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Set<Jogos> getJogos() {
        return jogos;
    }
    
    public void setJogos(Set<Jogos> Jogos) {
        this.jogos = Jogos;
    }
} 