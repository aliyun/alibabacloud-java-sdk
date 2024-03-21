// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkReachableAnalysisResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkReachableAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkReachableAnalysisResponseBody self = new DeleteNetworkReachableAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkReachableAnalysisResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteNetworkReachableAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
