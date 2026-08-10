// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRenderJobRequest extends TeaModel {
    /**
     * <p>The complete creative script (JSON string) after user confirmation or editing. The structure aligns with the JSON content in the <code>Result</code> file returned by the <code>GetRemakeScriptJob</code> API.</p>
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
     * <p>The rendering settings (JSON string).</p>
     * <ul>
     * <li><strong>Resolution</strong> (String, required): The resolution. Valid values: <code>720P</code>, <code>1080P</code>.<ul>
     * <li><p><strong>AspectRatio</strong> (String, optional): The video aspect ratio. Valid values: <code>9:16</code>, <code>16:9</code>, <code>1:1</code>. Default value: <code>9:16</code>.</p>
     * </li>
     * <li><p><strong>VoiceoverLanguage</strong> (String, optional): The voiceover language. Valid values: <code>zh</code> (Chinese), <code>en</code> (English), <code>es</code> (Spanish), <code>pt</code> (Portuguese), <code>fr</code> (French), <code>de</code> (German), <code>ja</code> (Japanese), <code>ko</code> (Korean), <code>ar</code> (Arabic). Default value: <code>zh</code>.</p>
     * </li>
     * <li><p><strong>WithSubtitles</strong> (Bool, optional): Specifies whether to generate subtitles. Default value: <code>true</code>.</p>
     * </li>
     * <li><p><strong>TTS</strong> (Object, optional): The TTS configuration. If not specified, the default voice is used. This parameter applies only to single-person scenarios with voiceover only.</p>
     * <ul>
     * <li><strong>VoiceUrl</strong> (String, optional): The URL of the voice file. The URL must be an HTTP or HTTPS address. If specified, the voiceover for the entire video uses this voice.</li>
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
     * <p>The custom user parameter in JSON format.</p>
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
