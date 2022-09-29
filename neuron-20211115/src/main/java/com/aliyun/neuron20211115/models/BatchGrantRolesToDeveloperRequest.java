// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BatchGrantRolesToDeveloperRequest extends TeaModel {
    @NameInMap("body")
    public BatchGrantRolesCmd body;

    public static BatchGrantRolesToDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantRolesToDeveloperRequest self = new BatchGrantRolesToDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public BatchGrantRolesToDeveloperRequest setBody(BatchGrantRolesCmd body) {
        this.body = body;
        return this;
    }
    public BatchGrantRolesCmd getBody() {
        return this.body;
    }

}
