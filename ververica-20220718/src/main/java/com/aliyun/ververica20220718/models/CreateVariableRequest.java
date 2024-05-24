// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateVariableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public Variable body;

    public static CreateVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableRequest self = new CreateVariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateVariableRequest setBody(Variable body) {
        this.body = body;
        return this;
    }
    public Variable getBody() {
        return this.body;
    }

}
