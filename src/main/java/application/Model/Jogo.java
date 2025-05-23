package application.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jogos")
@Getter
@Setter
public class Jogo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_modo_de_jogo", nullable = false)
    private ModoJogo modoDeJogo;

    // Quando é n/n tem q fazer uma tabela de junção
    
    @ManyToMany
    @JoinTable(name = "jogos_possuem_generos",
        joinColumns = @JoinColumn(name = "id_jogo"),
        inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private Set<Genero> generos = new HashSet<Genero>();

    @ManyToMany
    @JoinTable(name = "jogos_possuem_plataformas",
        joinColumns = @JoinColumn(name = "id_jogo"),
        inverseJoinColumns = @JoinColumn(name = "id_plataforma"))
    private Set<Plataforma> plataformas = new HashSet<Plataforma>();

} 