// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegePopResponseBody extends TeaModel {
    @NameInMap("list")
    public java.util.List<Privilege> list;

    @NameInMap("requestId")
    public String requestId;

    public static CreatePrivilegePopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegePopResponseBody self = new CreatePrivilegePopResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegePopResponseBody setList(java.util.List<Privilege> list) {
        this.list = list;
        return this;
    }
    public java.util.List<Privilege> getList() {
        return this.list;
    }

    public CreatePrivilegePopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
