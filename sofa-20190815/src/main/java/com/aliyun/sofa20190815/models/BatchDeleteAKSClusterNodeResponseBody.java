// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteAKSClusterNodeResponseBody extends TeaModel {
    @NameInMap("OpsId")
    public String opsId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchDeleteAKSClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAKSClusterNodeResponseBody self = new BatchDeleteAKSClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAKSClusterNodeResponseBody setOpsId(String opsId) {
        this.opsId = opsId;
        return this;
    }
    public String getOpsId() {
        return this.opsId;
    }

    public BatchDeleteAKSClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteAKSClusterNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchDeleteAKSClusterNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
