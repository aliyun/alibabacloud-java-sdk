// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceSecurityGroupsRequest extends TeaModel {
    /**
     * <p>An array that consists of the IDs of authorized security groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp14u00sh39jvw5****</p>
     */
    @NameInMap("AuthorizedSecurityGroups")
    public java.util.List<String> authorizedSecurityGroups;

    /**
     * <p>The ID of the bastion host.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the bastion host.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfigInstanceSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceSecurityGroupsRequest self = new ConfigInstanceSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceSecurityGroupsRequest setAuthorizedSecurityGroups(java.util.List<String> authorizedSecurityGroups) {
        this.authorizedSecurityGroups = authorizedSecurityGroups;
        return this;
    }
    public java.util.List<String> getAuthorizedSecurityGroups() {
        return this.authorizedSecurityGroups;
    }

    public ConfigInstanceSecurityGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceSecurityGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConfigInstanceSecurityGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
