// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenRequest extends TeaModel {
    @NameInMap("Resources")
    public String resources;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("Actions")
    public String actions;

    public static ApplyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenRequest self = new ApplyTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTokenRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ApplyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyTokenRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ApplyTokenRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

}
