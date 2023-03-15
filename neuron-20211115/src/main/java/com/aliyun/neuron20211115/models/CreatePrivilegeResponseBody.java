// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegeResponseBody extends TeaModel {
    @NameInMap("list")
    public java.util.List<Privilege> list;

    @NameInMap("requestId")
    public String requestId;

    public static CreatePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegeResponseBody self = new CreatePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegeResponseBody setList(java.util.List<Privilege> list) {
        this.list = list;
        return this;
    }
    public java.util.List<Privilege> getList() {
        return this.list;
    }

    public CreatePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
