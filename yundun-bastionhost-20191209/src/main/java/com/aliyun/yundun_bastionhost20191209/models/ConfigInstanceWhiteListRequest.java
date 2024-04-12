// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host for which you want to configure a whitelist of public IP addresses.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The public IP addresses that you want to add to the whitelist.</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static ConfigInstanceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhiteListRequest self = new ConfigInstanceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceWhiteListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigInstanceWhiteListRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}
