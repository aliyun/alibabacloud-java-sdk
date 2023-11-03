// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccountNameAvailableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameAvailableResponseBody self = new CheckAccountNameAvailableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameAvailableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
