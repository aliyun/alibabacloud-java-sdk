// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class PrecheckYikeAIAppJobRequest extends TeaModel {
    /**
     * <p>The AI application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The input parameters for running the AI application. The value is a JSON-serialized string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;LoadImage.1.TargetImage\&quot;:\&quot;MediaId1\&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    public static PrecheckYikeAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckYikeAIAppJobRequest self = new PrecheckYikeAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckYikeAIAppJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PrecheckYikeAIAppJobRequest setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

}
