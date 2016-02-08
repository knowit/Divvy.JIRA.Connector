package ut.com.divvy.atlassian.jiraconnector;

import org.junit.Test;
import com.divvy.atlassian.jiraconnector.api.MyPluginComponent;
import com.divvy.atlassian.jiraconnector.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}