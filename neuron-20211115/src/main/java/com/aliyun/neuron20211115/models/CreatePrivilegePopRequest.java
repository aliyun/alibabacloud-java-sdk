// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegePopRequest extends TeaModel {
    @NameInMap("body")
    public CreatePrivilegePopCmd body;

    public static CreatePrivilegePopRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegePopRequest self = new CreatePrivilegePopRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegePopRequest setBody(CreatePrivilegePopCmd body) {
        this.body = body;
        return this;
    }
    public CreatePrivilegePopCmd getBody() {
        return this.body;
    }

}
