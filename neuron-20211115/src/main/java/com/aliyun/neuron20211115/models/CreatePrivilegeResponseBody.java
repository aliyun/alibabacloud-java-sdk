// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Privilege> result;

    public static CreatePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegeResponseBody self = new CreatePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePrivilegeResponseBody setResult(java.util.List<Privilege> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Privilege> getResult() {
        return this.result;
    }

}
