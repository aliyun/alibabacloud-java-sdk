// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RegisterBucUserRequest extends TeaModel {
    @NameInMap("body")
    public RegisterBucUserCmd body;

    public static RegisterBucUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterBucUserRequest self = new RegisterBucUserRequest();
        return TeaModel.build(map, self);
    }

    public RegisterBucUserRequest setBody(RegisterBucUserCmd body) {
        this.body = body;
        return this;
    }
    public RegisterBucUserCmd getBody() {
        return this.body;
    }

}
