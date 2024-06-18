// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E4AA101-1EE5-41C0-AE6D-0F066331AC1C</p>
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
