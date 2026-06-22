// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAntiBruteForceRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBEB173-1F43-505F-A876-C03ECDF6CE4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAntiBruteForceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntiBruteForceRuleResponseBody self = new DeleteAntiBruteForceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntiBruteForceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
