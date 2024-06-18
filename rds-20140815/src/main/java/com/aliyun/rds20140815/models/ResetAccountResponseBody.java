// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>81BC9559-7B22-4B7F-B705-5F56DEECDEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountResponseBody self = new ResetAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
