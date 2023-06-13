// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswordRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VncPassword")
    public String vncPassword;

    public static ModifyInstanceVncPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswordRequest self = new ModifyInstanceVncPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceVncPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVncPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceVncPasswordRequest setVncPassword(String vncPassword) {
        this.vncPassword = vncPassword;
        return this;
    }
    public String getVncPassword() {
        return this.vncPassword;
    }

}
