// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetUnionTaskStatusRequest extends TeaModel {
    @NameInMap("AlipayOpenId")
    public Long alipayOpenId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserNick")
    public String userNick;

    public static GetUnionTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnionTaskStatusRequest self = new GetUnionTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUnionTaskStatusRequest setAlipayOpenId(Long alipayOpenId) {
        this.alipayOpenId = alipayOpenId;
        return this;
    }
    public Long getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public GetUnionTaskStatusRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GetUnionTaskStatusRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public GetUnionTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetUnionTaskStatusRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public GetUnionTaskStatusRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
