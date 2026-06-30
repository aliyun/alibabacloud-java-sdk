// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeAvatarNarratorJobRequest extends TeaModel {
    /**
     * <p>The node request content. JSON string. This parameter contains the following fields:</p>
     * <ul>
     * <li>SceneType: string. The common scenario type. Valid values: <code>creator-talk</code>: knowledge sharing, applicable to influencer sharing and explanation scenarios in industries such as finance and education.</li>
     * <li>TextType: int. The text type. Valid values: 1: raw script (product or news information, which the system automatically converts to an oral broadcast script). 2: oral broadcast script.</li>
     * <li>TextContent: string. The text content. Maximum length: 10000 characters.</li>
     * <li>UserMaterials: Array\&lt;Object\&gt;. The list of user materials. Fields: MediaId: the media asset ID (image or video uploaded to Wanjing Yike).</li>
     * <li>AvatarData: object. The digital human information. AvatarPortrait: required, string, the URL of the portrait image. AvatarVoice: optional, string, the audio URL (used as a reference for voice cloning) or a voice ID from the library (see the Wanjing Yike voice library. The system selects automatically).</li>
     * <li>VoiceDuration: int. The expected oral broadcast duration. Settings for this field apply when TextType is 1. Unit: seconds. Default value: 60. The final video duration is slightly shorter than the expected duration.</li>
     * <li>AspectRatio: string. The video dimensions. Valid values: 16:9, 9:16, 4:3, 3:4.</li>
     * <li>Resolution: string. The video resolution. Valid values: 720P, 1080P.</li>
     * <li>OutputLanguages: Array. The output video languages. Multiple values are supported. Currently, only Chinese is supported. Valid values: CN: Chinese (default). EN: English. YUE: Cantonese.</li>
     * <li>WithSubtitles: bool. Specifies whether to include subtitles. Valid values: true: include subtitles (default). false: do not include subtitles.</li>
     * </ul>
     * <p>-- The following parameters are for the vertical screen packaging template and are valid only for the creator-talk type. --</p>
     * <ul>
     * <li>TargetAspectRatio: string. The dimensions adapted for vertical screen. Valid values: <code>16:9</code>, <code>9:16</code>, <code>4:3</code>, <code>3:4</code>.</li>
     * <li>Title: string. The main title displayed in the template.</li>
     * <li>SubHeading: string. The subtitle displayed in the template.</li>
     * <li>Date: string. The date displayed in the template.</li>
     * <li>Watermark: object. The watermark displayed in the template. Fields: Text: the watermark text.</li>
     * <li>EnabledAICover: bool. Specifies whether to use AI to generate a cover image.</li>
     * <li>IPCharacter: Object. Specifies whether the AI-generated cover image includes an IP character. Fields: MediaId: the media asset ID. MediaUrl: a publicly accessible URL.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;JobParams&quot;: &quot;{\&quot;SceneType\&quot;:\&quot;creator-talk\&quot;,\&quot;TextType\&quot;:1,\&quot;TextContent\&quot;:\&quot;大摩点评美团业绩：无惊吓无惊喜，核心博弈点依然在市场份额与利润率回升。\&quot;,\&quot;AspectRatio\&quot;:\&quot;4:3\&quot;,\&quot;Resolution\&quot;:\&quot;720P\&quot;,\&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;EN\&quot;,\&quot;YUE\&quot;],\&quot;VoiceDuration\&quot;:15,\&quot;UserMaterials\&quot;:[{\&quot;MediaId\&quot;:\&quot;d5a26b50<strong><strong>71f1bfd9e7f6d45b6302\&quot;},{\&quot;MediaId\&quot;:\&quot;4ce65730</strong></strong>71f1bfd9e7f6d45b6302\&quot;}],\&quot;WithSubtitles\&quot;:true,\&quot;AvatarData\&quot;:{\&quot;AvatarPortrait\&quot;:\&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/aigc/market/cloth/avatar_image.png%5C%5C%22,%5C%5C%22AvatarVoice%5C%5C%22:%5C%5C%22sys_ElegantProperMiddleAgedWoman%5C%5C%22%7D%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/aigc/market/cloth/avatar_image.png\\&quot;,\\&quot;AvatarVoice\\&quot;:\\&quot;sys_ElegantProperMiddleAgedWoman\\&quot;}}</a>&quot;,
     *   &quot;UserData&quot;: &quot;{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://example.com/callback/video-task%5C%5C%22%7D">https://example.com/callback/video-task\\&quot;}</a>&quot;
     * }</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The custom user parameter. JSON string. This parameter is returned as-is in the callback result (for example, newsKey).</p>
     * <p>The system reserved field NotifyAddress specifies the callback URL. The system sends a callback to this URL after the task is complete. Example: {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitYikeAvatarNarratorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeAvatarNarratorJobRequest self = new SubmitYikeAvatarNarratorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeAvatarNarratorJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitYikeAvatarNarratorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
