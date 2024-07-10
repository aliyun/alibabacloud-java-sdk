// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebTrafficConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Anonymous</p>
     */
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("DisableInternetURL")
    public Boolean disableInternetURL;

    @NameInMap("RevisionsTrafficWeight")
    public java.util.Map<String, Float> revisionsTrafficWeight;

    @NameInMap("WebAclConfig")
    public WebAclConfig webAclConfig;

    public static WebTrafficConfig build(java.util.Map<String, ?> map) throws Exception {
        WebTrafficConfig self = new WebTrafficConfig();
        return TeaModel.build(map, self);
    }

    public WebTrafficConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public WebTrafficConfig setDisableInternetURL(Boolean disableInternetURL) {
        this.disableInternetURL = disableInternetURL;
        return this;
    }
    public Boolean getDisableInternetURL() {
        return this.disableInternetURL;
    }

    public WebTrafficConfig setRevisionsTrafficWeight(java.util.Map<String, Float> revisionsTrafficWeight) {
        this.revisionsTrafficWeight = revisionsTrafficWeight;
        return this;
    }
    public java.util.Map<String, Float> getRevisionsTrafficWeight() {
        return this.revisionsTrafficWeight;
    }

    public WebTrafficConfig setWebAclConfig(WebAclConfig webAclConfig) {
        this.webAclConfig = webAclConfig;
        return this;
    }
    public WebAclConfig getWebAclConfig() {
        return this.webAclConfig;
    }

}
