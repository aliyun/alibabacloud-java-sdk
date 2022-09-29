// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateRoleResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Role result;

    public static CreateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponseBody self = new CreateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoleResponseBody setResult(Role result) {
        this.result = result;
        return this;
    }
    public Role getResult() {
        return this.result;
    }

}
