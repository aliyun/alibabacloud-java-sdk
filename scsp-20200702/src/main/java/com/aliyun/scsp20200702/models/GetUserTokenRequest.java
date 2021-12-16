// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetUserTokenRequest extends TeaModel {
    // appKey
    @NameInMap("AppKey")
    public String appKey;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 昵称
    @NameInMap("Nick")
    public String nick;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    public static GetUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenRequest self = new GetUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetUserTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserTokenRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GetUserTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
