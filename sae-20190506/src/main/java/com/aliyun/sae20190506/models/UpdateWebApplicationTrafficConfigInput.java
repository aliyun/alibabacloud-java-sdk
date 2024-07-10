// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationTrafficConfigInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Anonymous</p>
     */
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("DisableURLInternet")
    public Boolean disableURLInternet;

    @NameInMap("RevisionsTrafficWeight")
    public java.util.Map<String, Float> revisionsTrafficWeight;

    @NameInMap("WebAclConfig")
    public WebAclConfig webAclConfig;

    public static UpdateWebApplicationTrafficConfigInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationTrafficConfigInput self = new UpdateWebApplicationTrafficConfigInput();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationTrafficConfigInput setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public UpdateWebApplicationTrafficConfigInput setDisableURLInternet(Boolean disableURLInternet) {
        this.disableURLInternet = disableURLInternet;
        return this;
    }
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    public UpdateWebApplicationTrafficConfigInput setRevisionsTrafficWeight(java.util.Map<String, Float> revisionsTrafficWeight) {
        this.revisionsTrafficWeight = revisionsTrafficWeight;
        return this;
    }
    public java.util.Map<String, Float> getRevisionsTrafficWeight() {
        return this.revisionsTrafficWeight;
    }

    public UpdateWebApplicationTrafficConfigInput setWebAclConfig(WebAclConfig webAclConfig) {
        this.webAclConfig = webAclConfig;
        return this;
    }
    public WebAclConfig getWebAclConfig() {
        return this.webAclConfig;
    }

}
