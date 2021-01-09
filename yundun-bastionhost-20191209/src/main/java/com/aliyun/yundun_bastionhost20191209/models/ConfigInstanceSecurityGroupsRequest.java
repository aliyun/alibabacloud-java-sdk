// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceSecurityGroupsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AuthorizedSecurityGroups")
    public java.util.List<String> authorizedSecurityGroups;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ConfigInstanceSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceSecurityGroupsRequest self = new ConfigInstanceSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceSecurityGroupsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ConfigInstanceSecurityGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public ConfigInstanceSecurityGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
