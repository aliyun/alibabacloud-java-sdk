// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppLlmApiKeyForPartnerRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Idempotent token (reserved)</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Description of the API key usage</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Caller-defined IP address whitelist (the backend appends the system default IP segment)</p>
     */
    @NameInMap("IpWhiteList")
    public java.util.List<String> ipWhiteList;

    public static CreateAppLlmApiKeyForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLlmApiKeyForPartnerRequest self = new CreateAppLlmApiKeyForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppLlmApiKeyForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAppLlmApiKeyForPartnerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppLlmApiKeyForPartnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppLlmApiKeyForPartnerRequest setIpWhiteList(java.util.List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public java.util.List<String> getIpWhiteList() {
        return this.ipWhiteList;
    }

}
