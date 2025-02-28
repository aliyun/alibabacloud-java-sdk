// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateVariableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public Variable body;

    public static UpdateVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableRequest self = new UpdateVariableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVariableRequest setBody(Variable body) {
        this.body = body;
        return this;
    }
    public Variable getBody() {
        return this.body;
    }

}
