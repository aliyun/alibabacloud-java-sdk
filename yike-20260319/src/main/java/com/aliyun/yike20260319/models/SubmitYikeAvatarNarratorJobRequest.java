// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeAvatarNarratorJobRequest extends TeaModel {
    /**
     * <p>The task request content. The value is a JSON string that contains the following parameters:</p>
     * <ul>
     * <li>SceneType: string. The common scenario type. Valid values:<ul>
     * <li>creator-talk: knowledge explanation. Applicable to scenarios such as news, popular science, and financial explanation.</li>
     * <li>avatar-broadcast: digital human broadcasting. A fixed single-shot scenario.</li>
     * </ul>
     * </li>
     * <li>TextType: int. The text type. Valid values:<ul>
     * <li>1: raw script. The system automatically converts product or news information into an oral broadcast script. This value is not supported for avatar-broadcast.</li>
     * <li>2: oral broadcast script.</li>
     * </ul>
     * </li>
     * <li>TextContent: string. The text content. Maximum length: 10,000 characters.</li>
     * <li>UserMaterials: Array\&lt;Object\&gt;. The list of user materials. This parameter is not supported for avatar-broadcast. Fields:<ul>
     * <li>MediaId: the media asset ID. The ID of an image or video uploaded to Wanjing Yike.</li>
     * </ul>
     * </li>
     * <li>AvatarData: object. The digital human information.<ul>
     * <li>AvatarPortrait: required. String. The URL of the portrait image.</li>
     * <li>AvatarVoice: optional. String. The URL of an audio file for voice cloning reference, or a voice ID from the built-in voice library. For more information, see the Wanjing Yike voice library. If this parameter is not specified, the system automatically selects a voice.</li>
     * </ul>
     * </li>
     * <li>VoiceDuration: int. The expected oral broadcast duration. Set this parameter when TextType is set to 1. Unit: seconds. Default value: 60. The final video duration is slightly shorter than the expected duration.</li>
     * <li>AspectRatio: string. The video dimensions. Valid values: 16:9, 9:16, 4:3, and 3:4.</li>
     * <li>Resolution: string. The video resolution. Valid values: 720P and 1080P.</li>
     * <li>WithSubtitles: bool. Specifies whether to add subtitles. Valid values:<ul>
     * <li>true (default): Add subtitles.</li>
     * <li>false: Do not add subtitles.</li>
     * </ul>
     * </li>
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
     * <p>The custom user parameter. The value is a JSON string that is returned as-is in the callback result, for example, newsKey.</p>
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
