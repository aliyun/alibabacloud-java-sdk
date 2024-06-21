// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteTemplateScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1B9C6333-5904-5A1E-9845-CB17A369AFDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTemplateScratchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateScratchResponseBody self = new DeleteTemplateScratchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateScratchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
