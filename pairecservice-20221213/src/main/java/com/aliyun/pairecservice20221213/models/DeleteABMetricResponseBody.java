// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricResponseBody self = new DeleteABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
