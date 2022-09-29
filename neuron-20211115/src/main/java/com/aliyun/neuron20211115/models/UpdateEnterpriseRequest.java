// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseRequest extends TeaModel {
    @NameInMap("body")
    public EnterpriseInfoUpdateCmd body;

    public static UpdateEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseRequest self = new UpdateEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseRequest setBody(EnterpriseInfoUpdateCmd body) {
        this.body = body;
        return this;
    }
    public EnterpriseInfoUpdateCmd getBody() {
        return this.body;
    }

}
