// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVoiceNarratorJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TextType\&quot;:2,\&quot;TextContent\&quot;:\&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....\&quot;,\&quot;AspectRatio\&quot;:\&quot;16:9\&quot;, \&quot;Resolution\&quot;:\&quot;720P\&quot;, \&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;YUE\&quot;]&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
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
