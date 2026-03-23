// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationPromptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>papt-f9lajgw765f4fnrzn1</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationPromptResponseBody self = new DeleteApplicationPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationPromptResponseBody setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public DeleteApplicationPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
