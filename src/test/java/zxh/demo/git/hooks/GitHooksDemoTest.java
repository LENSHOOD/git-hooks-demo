package zxh.demo.git.hooks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class GitHooksDemoTest {
    @Test
    void should_get_GitHooksDemo_when_call_sayGitHooksDemo() {
        GitHooksDemo gitHooksDemo = new GitHooksDemo();
        assertThat(gitHooksDemo.sayGitHooksDemo(), is("Git Hooks Demo"));
    }
}