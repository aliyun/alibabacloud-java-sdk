// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebTrafficConfig extends TeaModel {
    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>Anonymous</strong>: does not require authentication.</li>
     * <li><strong>Application</strong>: requires authentication.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>Anonymous</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Anonymous</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Specifies whether to disable access to the default Internet domain. If you set this parameter to true, a 403 error is returned if you access the default public URL provided by the function. A value of false does not have affect the running of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableInternetURL")
    public Boolean disableInternetURL;

    /**
     * <p>Specifies the traffic weight of applications in different versions. The sum of traffic weight for all versions must be 100%.</p>
     */
    @NameInMap("RevisionsTrafficWeight")
    public java.util.Map<String, Float> revisionsTrafficWeight;

    /**
     * <p>The configurations of IP ACL whitelist.</p>
     */
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
