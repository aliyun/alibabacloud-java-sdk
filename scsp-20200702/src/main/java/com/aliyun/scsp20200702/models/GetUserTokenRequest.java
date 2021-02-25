// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetUserTokenRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("AppKey")
    public String appKey;

    public static GetUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenRequest self = new GetUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserTokenRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GetUserTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
