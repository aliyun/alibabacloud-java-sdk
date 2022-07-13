// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SendVerificationCodeRequest extends TeaModel {
    // 客户请求唯一id，用于幂等校验，可以用uuid生成
    @NameInMap("ClientToken")
    public String clientToken;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 手机号（坐席绑定手机号码）
    @NameInMap("Phone")
    public String phone;

    public static SendVerificationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeRequest self = new SendVerificationCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SendVerificationCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendVerificationCodeRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
