// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateCopilotSessionRequest extends TeaModel {
    /**
     * <p>不填为 New Session</p>
     * 
     * <strong>example:</strong>
     * <p>排查 CPU 负载</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateCopilotSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotSessionRequest self = new CreateCopilotSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateCopilotSessionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
