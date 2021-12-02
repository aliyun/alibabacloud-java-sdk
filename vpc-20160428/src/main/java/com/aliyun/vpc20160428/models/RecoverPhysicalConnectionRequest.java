// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverPhysicalConnectionRequest extends TeaModel {
    // DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 恢复的Pconn
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    // 幂等Token
    @NameInMap("Token")
    public String token;

    public static RecoverPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverPhysicalConnectionRequest self = new RecoverPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public RecoverPhysicalConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RecoverPhysicalConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RecoverPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RecoverPhysicalConnectionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
