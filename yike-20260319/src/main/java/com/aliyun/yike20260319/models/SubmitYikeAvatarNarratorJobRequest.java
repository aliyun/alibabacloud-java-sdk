// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeAvatarNarratorJobRequest extends TeaModel {
    /**
     * <p>The node request content. JSON string that contains the following parameters:</p>
     * <ul>
     * <li>SceneType: string. The common scenario type. Valid values:<ul>
     * <li>creator-talk: knowledge explanation, suitable for news, science, and finance explanation scenarios.</li>
     * <li>avatar-broadcast: digital human broadcast, fixed single-shot scenario.</li>
     * <li>creator-sales-oneshot: influencer marketing, single-shot oral broadcast mixed-editing scenario.</li>
     * </ul>
     * </li>
     * <li>TextType: int. The text type. Valid values:<ul>
     * <li>1: raw script (product or news information, automatically converted to oral broadcast script by the system. Not supported for avatar-broadcast).</li>
     * <li>2: oral broadcast script.</li>
     * </ul>
     * </li>
     * <li>TextContent: string. The text content. Maximum length: 10000 characters.</li>
     * <li>UserMaterials: Array<Object>. The user material list (not supported for avatar-broadcast). Contains the following fields:<ul>
     * <li>MediaId: the media asset ID (image or video uploaded to Wanjing Yike).</li>
     * <li>Type: the media type (valid values: image, video).</li>
     * <li>Action: the material usage method. Valid values:<ul>
     * <li>match: intelligently matches suitable segments from video materials based on the oral broadcast script.</li>
     * <li>insert: intelligently determines the insertion position of video materials based on the oral broadcast script.</li>
     * <li>insert_first: prepends the video material.</li>
     * <li>insert_last: appends the video material.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>AvatarData: object. The digital human information.<ul>
     * <li>AvatarPortrait: required. String. The portrait image URL.</li>
     * <li>AvatarVoice: optional. String. An audio URL (used as a reference for voice cloning) or a voice ID from the library (refer to the Wanjing Yike voice library. The system selects automatically if not specified).</li>
     * </ul>
     * </li>
     * <li>VoiceDuration: int. The expected oral broadcast duration. Set this parameter when TextType is 1. Unit: seconds. Default value: 60. The final video duration is slightly less than the expected duration.</li>
     * <li>AspectRatio: string. The output dimensions. Valid values: 16:9, 9:16, 4:3, 3:4.</li>
     * <li>Resolution: string. The video resolution. Valid values: 720P, 1080P.</li>
     * <li>WithSubtitles: bool. Specifies whether to include subtitles. Valid values:<ul>
     * <li>true: includes subtitles. This is the default value.</li>
     * <li>false: does not include subtitles.</li>
     * </ul>
     * </li>
     * <li>EnabledAICover: bool. Specifies whether to generate a cover image (AI-generated based on the oral broadcast content).</li>
     * <li>IPCharacter: object. The AI cover character. Specify either MediaId or MediaUrl.</li>
     * <li>EndCard: string. The video ending image (image media asset ID or URL). Commonly used for marketing CTA conversion.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;JobParams&quot;: &quot;{\&quot;SceneType\&quot;:\&quot;creator-talk\&quot;,\&quot;TextType\&quot;:1,\&quot;TextContent\&quot;:\&quot;Morgan Stanley comments on Meituan\&quot;s performance: no scares, no surprises. The core debate remains on market share and profit margin recovery.\&quot;,\&quot;AspectRatio\&quot;:\&quot;4:3\&quot;,\&quot;Resolution\&quot;:\&quot;720P\&quot;,\&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;EN\&quot;,\&quot;YUE\&quot;],\&quot;VoiceDuration\&quot;:15,\&quot;UserMaterials\&quot;:[{\&quot;MediaId\&quot;:\&quot;d5a26b50<strong><strong>71f1bfd9e7f6d45b6302\&quot;},{\&quot;MediaId\&quot;:\&quot;4ce65730</strong></strong>71f1bfd9e7f6d45b6302\&quot;}],\&quot;WithSubtitles\&quot;:true,\&quot;AvatarData\&quot;:{\&quot;AvatarPortrait\&quot;:\&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/aigc/market/cloth/avatar_image.png%5C%5C%22,%5C%5C%22AvatarVoice%5C%5C%22:%5C%5C%22sys_ElegantProperMiddleAgedWoman%5C%5C%22%7D%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/aigc/market/cloth/avatar_image.png\\&quot;,\\&quot;AvatarVoice\\&quot;:\\&quot;sys_ElegantProperMiddleAgedWoman\\&quot;}}</a>&quot;,
     *   &quot;UserData&quot;: &quot;{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://example.com/callback/video-task%5C%5C%22%7D">https://example.com/callback/video-task\\&quot;}</a>&quot;
     * }</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The custom user parameter. JSON string. The callback result carries this parameter as-is (for example, newsKey).</p>
     * <p>System reserved field: NotifyAddress. The callback URL. The system sends a callback to this URL after the task is completed. Example: {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a>.</p>
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
