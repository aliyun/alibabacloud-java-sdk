// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateEnterpriseRequest extends TeaModel {
    @NameInMap("body")
    public Enterprise body;

    public static CreateEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseRequest self = new CreateEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseRequest setBody(Enterprise body) {
        this.body = body;
        return this;
    }
    public Enterprise getBody() {
        return this.body;
    }

}
