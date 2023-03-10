package az.code.tourbot.entities;

import az.code.tourbot.enums.LanguageCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "option_translations")
public class OptionTranslation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "text")
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "language_code")
    private LanguageCode languageCode;
}

