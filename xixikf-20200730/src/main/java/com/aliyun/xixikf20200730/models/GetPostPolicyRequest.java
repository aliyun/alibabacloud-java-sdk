// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetPostPolicyRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPostPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPostPolicyRequest self = new GetPostPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPostPolicyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GetPostPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
