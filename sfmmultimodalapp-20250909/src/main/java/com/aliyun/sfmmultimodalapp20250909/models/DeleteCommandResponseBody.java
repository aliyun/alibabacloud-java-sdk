// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandResponseBody self = new DeleteCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCommandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
