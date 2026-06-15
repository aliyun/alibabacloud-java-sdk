// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteLLMConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96EE513F-8626-50B8-B046-D57FD3D037C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLLMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLLMConfigResponseBody self = new DeleteLLMConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLLMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
