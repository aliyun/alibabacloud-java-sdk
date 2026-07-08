// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPublishStatusRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The deployment order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4998717</p>
     */
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    /**
     * <p>The website domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("WebsiteDomain")
    public String websiteDomain;

    public static GetAppPublishStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppPublishStatusRequest self = new GetAppPublishStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAppPublishStatusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppPublishStatusRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public GetAppPublishStatusRequest setWebsiteDomain(String websiteDomain) {
        this.websiteDomain = websiteDomain;
        return this;
    }
    public String getWebsiteDomain() {
        return this.websiteDomain;
    }

}
