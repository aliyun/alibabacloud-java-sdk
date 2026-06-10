// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetLlmProxyConfigForAdminRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Capability Type: llm, image, video</p>
     * 
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    public static GetLlmProxyConfigForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLlmProxyConfigForAdminRequest self = new GetLlmProxyConfigForAdminRequest();
        return TeaModel.build(map, self);
    }

    public GetLlmProxyConfigForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetLlmProxyConfigForAdminRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

}
