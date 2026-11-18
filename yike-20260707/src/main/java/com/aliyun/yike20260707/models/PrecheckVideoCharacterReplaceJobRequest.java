// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class PrecheckVideoCharacterReplaceJobRequest extends TeaModel {
    /**
     * <p>The ID of the video character replacement application. Use a configured application.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application input parameters, which are provided as a JSON-serialized string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    public static PrecheckVideoCharacterReplaceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckVideoCharacterReplaceJobRequest self = new PrecheckVideoCharacterReplaceJobRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckVideoCharacterReplaceJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PrecheckVideoCharacterReplaceJobRequest setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

}
