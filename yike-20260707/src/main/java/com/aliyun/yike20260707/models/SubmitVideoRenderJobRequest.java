// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRenderJobRequest extends TeaModel {
    /**
     * <p>The complete creative script confirmed or edited by the user, formatted as a JSON string. The structure must align with the JSON content in the Result file returned by the GetRemakeScriptJob API.</p>
     * 
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
     * <p>The rendering settings, formatted as a JSON string.</p>
     * <ul>
     * <li><strong>Resolution</strong> (String, required): The resolution. Valid values: 720P and 1080P.<ul>
     * <li><p><strong>AspectRatio</strong> (String, optional): The video aspect ratio. Valid values: 9:16, 16:9, and 1:1. Default value: 9:16.</p>
     * </li>
     * <li><p><strong>VoiceoverLanguage</strong> (String, optional): The voiceover language. Valid values: zh (Chinese), en (English), es (Spanish), pt (Portuguese), fr (French), de (German), ja (Japanese), ko (Korean), and ar (Arabic). Default value: zh.</p>
     * </li>
     * <li><p><strong>WithSubtitles</strong> (Boolean, optional): Specifies whether to generate subtitles. Default value: true.</p>
     * </li>
     * <li><p><strong>TTS</strong> (Object, optional): The text-to-speech (TTS) configuration. If you do not specify this parameter, the default voice is used. This parameter applies only to single-person and voiceover-only scenarios.</p>
     * <ul>
     * <li><strong>VoiceUrl</strong> (String, optional): The URL of the voice file, which must be an HTTP or HTTPS address. If specified, this voice is used for the voiceover throughout the entire video.</li>
     * </ul>
     * </li>
     * <li><p><strong>Bgm</strong> (String, optional): The URL or 32-character media asset ID of the background music.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * <p>The user-defined parameters, formatted as a JSON string.</p>
     * 
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
