// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSampleConsistencyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSampleConsistencyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleConsistencyJobResponseBody self = new DeleteSampleConsistencyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSampleConsistencyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
