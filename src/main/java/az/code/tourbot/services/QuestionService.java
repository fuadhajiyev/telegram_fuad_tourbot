package az.code.tourbot.services;

import az.code.tourbot.entities.Question;
import az.code.tourbot.enums.LanguageCode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface QuestionService {
    SendMessage prepareQuestion(Long chatId, LanguageCode code, Question question);
    SendMessage prepareLanguageQuestion(Long chatId);
}
