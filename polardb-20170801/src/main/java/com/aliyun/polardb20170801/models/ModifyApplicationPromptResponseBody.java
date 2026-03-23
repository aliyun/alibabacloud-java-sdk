// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationPromptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>papt-f9lajgw765f4fnrzn1</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <strong>example:</strong>
     * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApplicationPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationPromptResponseBody self = new ModifyApplicationPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationPromptResponseBody setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public ModifyApplicationPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
