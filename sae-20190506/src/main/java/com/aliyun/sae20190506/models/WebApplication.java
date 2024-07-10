// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplication extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("InternetURL")
    public String internetURL;

    @NameInMap("IntranetURL")
    public String intranetURL;

    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("RevisionConfig")
    public RevisionConfig revisionConfig;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WebScalingConfig")
    public WebScalingConfig webScalingConfig;

    @NameInMap("WebTrafficConfig")
    public WebTrafficConfig webTrafficConfig;

    public static WebApplication build(java.util.Map<String, ?> map) throws Exception {
        WebApplication self = new WebApplication();
        return TeaModel.build(map, self);
    }

    public WebApplication setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public WebApplication setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public WebApplication setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public WebApplication setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WebApplication setInternetURL(String internetURL) {
        this.internetURL = internetURL;
        return this;
    }
    public String getInternetURL() {
        return this.internetURL;
    }

    public WebApplication setIntranetURL(String intranetURL) {
        this.intranetURL = intranetURL;
        return this;
    }
    public String getIntranetURL() {
        return this.intranetURL;
    }

    public WebApplication setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public WebApplication setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public WebApplication setRevisionConfig(RevisionConfig revisionConfig) {
        this.revisionConfig = revisionConfig;
        return this;
    }
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    public WebApplication setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public WebApplication setWebScalingConfig(WebScalingConfig webScalingConfig) {
        this.webScalingConfig = webScalingConfig;
        return this;
    }
    public WebScalingConfig getWebScalingConfig() {
        return this.webScalingConfig;
    }

    public WebApplication setWebTrafficConfig(WebTrafficConfig webTrafficConfig) {
        this.webTrafficConfig = webTrafficConfig;
        return this;
    }
    public WebTrafficConfig getWebTrafficConfig() {
        return this.webTrafficConfig;
    }

}
