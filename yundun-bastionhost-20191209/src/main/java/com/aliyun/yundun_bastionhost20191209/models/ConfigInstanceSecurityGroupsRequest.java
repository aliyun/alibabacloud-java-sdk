// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceSecurityGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of authorized security group.</p>
     */
    @NameInMap("AuthorizedSecurityGroups")
    public java.util.List<String> authorizedSecurityGroups;

    /**
     * <p>The ID of the bastion host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the bastion host.</p>
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
