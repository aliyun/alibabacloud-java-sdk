// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckAccountNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccountNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameResponseBody self = new CheckAccountNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
