// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class AppMessagePushRequest extends TeaModel {
    @NameInMap("ExpirationTime")
    public Long expirationTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("UserId")
    public String userId;

    public static AppMessagePushRequest build(java.util.Map<String, ?> map) throws Exception {
        AppMessagePushRequest self = new AppMessagePushRequest();
        return TeaModel.build(map, self);
    }

    public AppMessagePushRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public AppMessagePushRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppMessagePushRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AppMessagePushRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
