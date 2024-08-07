// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>37A9F0FD-51D0-58D5-B91F-DF570281556B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponseBody self = new DeleteApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
