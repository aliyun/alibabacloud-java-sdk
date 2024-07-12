// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteDatasourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2E1575F-29D1-5579-B649-B7883A793562</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasourceResponseBody self = new DeleteDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
