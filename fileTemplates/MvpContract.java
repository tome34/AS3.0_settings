#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.fec.core.inf.IView;
import com.fec.core.inf.IPresenter;
import com.fec.core.inf.IModel;
#parse("File Header.java")

public interface I${NAME}Contract {
    interface View extends IView{}
    interface Presenter extends IPresenter<View>{}
    interface Model extends IModel{}
}
