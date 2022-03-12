package com.github.panarik.appiumProject.model.screen.signIn;

/**
 * Интерфейс, описывающий общие методы для экрана вне зависимости к какой платформе экран относится.
 * Особенности экрана для каждой конкретной платформы реализованы в отдельном классе для этой платформы.
 */
public interface SignIn {

    /**
     * Пользователь находится на данном экране
     */
    void checkScreen();

}