// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ScaleAKSClusterNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("OpsId")
    public String opsId;

    public static ScaleAKSClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleAKSClusterNodeResponseBody self = new ScaleAKSClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleAKSClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScaleAKSClusterNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ScaleAKSClusterNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ScaleAKSClusterNodeResponseBody setOpsId(String opsId) {
        this.opsId = opsId;
        return this;
    }
    public String getOpsId() {
        return this.opsId;
    }

}
