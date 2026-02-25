// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationTrafficConfigInput extends TeaModel {
    /**
     * <p>The authentication type. Valid values: Anonymous (default): does not require authentication. Application: requires authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>Anonymous</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Specifies whether to disable access to the default Internet domain. If you set this parameter to true, a 403 error is returned if you access the default public URL provided by the application. A value of false does not have affect the running of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableURLInternet")
    public Boolean disableURLInternet;

    /**
     * <p>The traffic distribution for the application versions. The sum of traffic percentages for all versions must be equal to 1.</p>
     */
    @NameInMap("RevisionsTrafficWeight")
    public java.util.Map<String, Float> revisionsTrafficWeight;

    /**
     * <p>The configurations of the access control list (ACL) that consists of IP addresses.</p>
     */
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
