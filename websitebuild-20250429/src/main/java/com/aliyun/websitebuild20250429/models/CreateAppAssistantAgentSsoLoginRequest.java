// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentSsoLoginRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Platform Type</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("PlatformType")
    public String platformType;

    /**
     * <p>Target URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://172.16.70.16:9410/metrics">http://172.16.70.16:9410/metrics</a></p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    public static CreateAppAssistantAgentSsoLoginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentSsoLoginRequest self = new CreateAppAssistantAgentSsoLoginRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentSsoLoginRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAppAssistantAgentSsoLoginRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public CreateAppAssistantAgentSsoLoginRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

}
