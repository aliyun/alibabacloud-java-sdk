// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateDeveloperRequest extends TeaModel {
    @NameInMap("body")
    public DeveloperInfoUpdateCmd body;

    public static UpdateDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeveloperRequest self = new UpdateDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeveloperRequest setBody(DeveloperInfoUpdateCmd body) {
        this.body = body;
        return this;
    }
    public DeveloperInfoUpdateCmd getBody() {
        return this.body;
    }

}
