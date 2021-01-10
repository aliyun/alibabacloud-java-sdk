// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteLDCFederationSpannerClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchDeleteLDCFederationSpannerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLDCFederationSpannerClusterResponseBody self = new BatchDeleteLDCFederationSpannerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLDCFederationSpannerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteLDCFederationSpannerClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchDeleteLDCFederationSpannerClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
