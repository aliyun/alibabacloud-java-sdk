// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRenderJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;schemaVersion&quot;:&quot;creative/v1&quot;,
     * &quot;algoResult&quot;:{...},
     * &quot;extraInfo&quot;:{...}
     * }</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;VoiceoverLanguage&quot;: &quot;zh&quot;,
     *   &quot;Resolution&quot;: &quot;1080P&quot;,
     *   &quot;AspectRatio&quot;: &quot;9:16&quot;,
     *   &quot;TTS&quot;: {
     *     &quot;VoiceUrl&quot;: &quot;<a href="http://xxx.mp3">http://xxx.mp3</a>&quot;
     *   },
     *   &quot;WithSubtitles&quot;: true,
     *   &quot;Bgm&quot;: &quot;<a href="http://xxx.mp3">http://xxx.mp3</a>&quot;
     * }</p>
     */
    @NameInMap("Settings")
    public String settings;

    /**
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoRenderJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoRenderJobRequest self = new SubmitVideoRenderJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoRenderJobRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public SubmitVideoRenderJobRequest setSettings(String settings) {
        this.settings = settings;
        return this;
    }
    public String getSettings() {
        return this.settings;
    }

    public SubmitVideoRenderJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
