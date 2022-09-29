// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegeRequest extends TeaModel {
    @NameInMap("body")
    public CreatePrivilegeCmd body;

    public static CreatePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegeRequest self = new CreatePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegeRequest setBody(CreatePrivilegeCmd body) {
        this.body = body;
        return this;
    }
    public CreatePrivilegeCmd getBody() {
        return this.body;
    }

}
