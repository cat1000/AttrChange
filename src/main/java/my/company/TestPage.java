package my.company;

import com.googlecode.wicket.jquery.ui.form.slider.AjaxSlider;
import com.googlecode.wicket.jquery.ui.panel.JQueryFeedbackPanel;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;

public class TestPage extends WebPage {
    private static final long serialVersionUID = 1L;

    // Model //
    private final Model<Integer> model = Model.of(10);

    public TestPage() {
        this.initialize();
    }

    private void initialize() {

    }



}