package nucleus.view;

import nucleus.presenter.Presenter;

public interface PresenterProvider<T extends Presenter> {
    T getPresenter();
}
