// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetPostPolicyRequest extends TeaModel {
    @NameInMap("bizCode")
    public String bizCode;

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

}
