// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVideoCloneJobRequest extends TeaModel {
    /**
     * <p>The job request content. JSON string that contains the following parameters:</p>
     * <ul>
     * <li>SceneType: string. The replication scene type. Valid values: <code>variant-clone</code>: full replication, applicable to same-category content rewriting scenarios where only partial elements (person/voice/image/text) are replaced.</li>
     * <li>OriginalVideo: object type that contains the following field: MediaId - the media asset ID (video uploaded to the platform).</li>
     * <li>SceneConfig: JSON string type. The scene extension parameters. For the variant-clone type, the value is <code>{&quot;OldProductName&quot;:&quot;xxx&quot;,&quot;ProductName&quot;:&quot;xxx&quot;}</code>.</li>
     * <li>UserMaterials: Array<Object> type. The list of user materials that contains the following field: MediaId - the media asset ID (image or video uploaded to the platform).</li>
     * <li>AvatarData: object type. The digital human information. AvatarPortrait: required, string, the portrait image URL. AvatarVoice: optional, string, the audio URL (used as a reference for audio replication).</li>
     * <li>Resolution: string type. The video resolution. Valid values: <code>720P</code>, <code>1080P</code>.</li>
     * <li>WithSubtitles: bool type. Specifies whether to include subtitles. Valid values: true: includes subtitles (default). false: does not include subtitles.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;JobParams&quot;: &quot;{\&quot;SceneType\&quot;:\&quot;variant-clone\&quot;,\&quot;OriginalVideo\&quot;:{\&quot;MediaId\&quot;:\&quot;1d342ee<strong><strong>c71f18000e7f6d45b6302\&quot;},\&quot;SceneConfig\&quot;:\xxxxxxxxx\&quot;,\&quot;Resolution\&quot;:\&quot;720P\&quot;,\&quot;AvatarData\&quot;:{\&quot;AvatarPortrait\&quot;:\&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/sucai/videoremake/0518/shuziren-005.png%5C%5C%22,%5C%5C%22AvatarVoice%5C%5C%22:%5C%5C%22xxxxxx%5C%5C%22%7D,%5C%5C%22UserMaterials%5C%5C%22:%5B%7B%5C%5C%22MediaId%5C%5C%22:%5C%5C%22e3785e10">https://example-bucket.oss-cn-shanghai.aliyuncs.com/sucai/videoremake/0518/shuziren-005.png\\&quot;,\\&quot;AvatarVoice\\&quot;:\\&quot;xxxxxx\\&quot;},\\&quot;UserMaterials\\&quot;:[{\\&quot;MediaId\\&quot;:\\&quot;e3785e10</a></strong></strong>71f1bfc9e7f6c6586301\&quot;}],\&quot;WithSubtitles\&quot;:true}&quot;
     * }</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The custom user parameter. JSON string. The callback result carries this value as-is (for example, newsKey).</p>
     * <p>System reserved field NotifyAddress: the callback URL. The system sends a callback to this URL after the task is completed. Example: {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitYikeVideoCloneJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVideoCloneJobRequest self = new SubmitYikeVideoCloneJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVideoCloneJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitYikeVideoCloneJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
