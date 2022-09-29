// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateDeveloperRequest extends TeaModel {
    @NameInMap("body")
    public Developer body;

    public static CreateDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeveloperRequest self = new CreateDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeveloperRequest setBody(Developer body) {
        this.body = body;
        return this;
    }
    public Developer getBody() {
        return this.body;
    }

}
