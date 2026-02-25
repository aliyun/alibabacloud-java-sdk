// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplication extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sae-app</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The time when the application was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-11 15:54:49</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>my sae app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The public URL for accessing the application.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****.cn-hangzhou.sae.run</p>
     */
    @NameInMap("InternetURL")
    public String internetURL;

    /**
     * <p>The internal URL for accessing the application.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****.cn-hangzhou-vpc.sae.run</p>
     */
    @NameInMap("IntranetURL")
    public String intranetURL;

    /**
     * <p>The time when the application was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-11 20:12:58</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The ID of the namespace to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configurations of the revision version.</p>
     */
    @NameInMap("RevisionConfig")
    public RevisionConfig revisionConfig;

    /**
     * <p>The Virtual Private Cloud (VPC) ID of the application namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze0i263cnn311nvj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The scaling configurations of the application.</p>
     */
    @NameInMap("WebScalingConfig")
    public WebScalingConfig webScalingConfig;

    /**
     * <p>The traffic configurations of the application.</p>
     */
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
