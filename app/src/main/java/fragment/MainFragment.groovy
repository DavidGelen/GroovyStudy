import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wwe.R
import groovy.transform.CompileStatic


@CompileStatic
class MainFragment extends Fragment{


    @Override
    View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment,null)
    }

    @Override
    void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState)
    }

}