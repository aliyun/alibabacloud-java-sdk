// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ConfigInstanceNetworkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicAccessControl")
    public Integer publicAccessControl;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PrivateWhiteList")
    public java.util.List<String> privateWhiteList;

    @NameInMap("PublicWhiteList")
    public java.util.List<String> publicWhiteList;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static ConfigInstanceNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceNetworkRequest self = new ConfigInstanceNetworkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceNetworkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceNetworkRequest setPublicAccessControl(Integer publicAccessControl) {
        this.publicAccessControl = publicAccessControl;
        return this;
    }
    public Integer getPublicAccessControl() {
        return this.publicAccessControl;
    }

    public ConfigInstanceNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigInstanceNetworkRequest setPrivateWhiteList(java.util.List<String> privateWhiteList) {
        this.privateWhiteList = privateWhiteList;
        return this;
    }
    public java.util.List<String> getPrivateWhiteList() {
        return this.privateWhiteList;
    }

    public ConfigInstanceNetworkRequest setPublicWhiteList(java.util.List<String> publicWhiteList) {
        this.publicWhiteList = publicWhiteList;
        return this;
    }
    public java.util.List<String> getPublicWhiteList() {
        return this.publicWhiteList;
    }

    public ConfigInstanceNetworkRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
