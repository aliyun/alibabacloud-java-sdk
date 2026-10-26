// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CF1E160-3F36-5E73-A170-C75504F05BBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskResponseBody self = new UpdateTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
