// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class ApplyTokenRequest extends TeaModel {
    @NameInMap("Actions")
    public String actions;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Resources")
    public String resources;

    public static ApplyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenRequest self = new ApplyTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTokenRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public ApplyTokenRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ApplyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyTokenRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
