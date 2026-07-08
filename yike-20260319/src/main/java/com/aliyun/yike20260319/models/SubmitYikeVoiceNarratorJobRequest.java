// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVoiceNarratorJobRequest extends TeaModel {
    /**
     * <p>The node request content. JSON string. This parameter contains the following fields:</p>
     * <ul>
     * <li>SceneType: string. The common scenarios type. Valid values: <code>briefing-voiceover</code>: news broadcasting or financial education industry.</li>
     * <li>TextType: int. The text type. Valid values: <code>1</code>: raw text (product or news information that is automatically converted to a voice-over script by the system). <code>2</code>: voice-over script.</li>
     * <li>TextContent: string. The text content. Maximum length: 10,000 characters.</li>
     * <li>UserMaterials: Array\&lt;Object\&gt;. The list of user materials. Fields: MediaId: the media asset ID (an image or video uploaded to Wanjing Yike).</li>
     * <li>NarrationVoiceId: string. The narration voice ID. For valid values, see the documentation. Default value: <code>sys_ElegantProperMiddleAgedWoman</code>.</li>
     * <li>VoiceDuration: int. The expected voice-over duration. Set this field when <code>TextType==1</code>. Unit: seconds. Default value: 60. The final video duration is slightly shorter than the expected duration.</li>
     * <li>AspectRatio: string. The video aspect ratio. Valid values: <code>16:9</code>, <code>9:16</code>, <code>4:3</code>, <code>3:4</code>.</li>
     * <li>Resolution: string. The video resolution. Valid values: <code>720P</code>, <code>1080P</code>.</li>
     * <li>OutputLanguages: Array\&lt;String\&gt;. The output video languages. Multiple values are supported (currently only Chinese is supported). Valid values: <code>CN</code>: Chinese (default). <code>EN</code>: English. <code>YUE</code>: Cantonese.</li>
     * <li>WithSubtitles: bool. Specifies whether to include subtitles. Valid values: true: includes subtitles (default). false: does not include subtitles.</li>
     * </ul>
     * <p>-- The following parameters are for the vertical screen packaging template and are valid only for the briefing-voiceover type. --</p>
     * <ul>
     * <li>TargetAspectRatio: string. The aspect ratio adapted for vertical screens. Valid values: <code>9:16</code>, <code>3:4</code>.</li>
     * <li>Title: string. The main title displayed in the template.</li>
     * <li>SubHeading: string. The subtitle displayed in the template.</li>
     * <li>Date: string. The date displayed in the template.</li>
     * <li>Watermark: object. The watermark displayed in the template. Fields: Text: the watermark text.</li>
     * <li>EnabledAICover: bool. Specifies whether to use AI to generate a cover image.</li>
     * <li>IPCharacter: Object. Settings for whether the AI-generated cover image includes an IP character. Fields: MediaId: the media asset ID. MediaUrl: a publicly accessible URL.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SceneType\&quot;:\&quot;briefing-voiceover\&quot;，&quot;TextType\&quot;:2,\&quot;TextContent\&quot;:\&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....\&quot;,\&quot;AspectRatio\&quot;:\&quot;16:9\&quot;, \&quot;Resolution\&quot;:\&quot;720P\&quot;, \&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;YUE\&quot;]&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The custom user parameter. JSON string. The callback result carries this parameter as-is (for example, newsKey).</p>
     * <p>System reserved field NotifyAddress: the callback URL. The system sends a callback to this URL after the task is completed.
     * <code>{&quot;NotifyAddress&quot;: &quot;http://xxx.callback.url&quot;}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitYikeVoiceNarratorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVoiceNarratorJobRequest self = new SubmitYikeVoiceNarratorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVoiceNarratorJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitYikeVoiceNarratorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
