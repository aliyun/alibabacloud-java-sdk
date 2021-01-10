// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSClusterResponseBody extends TeaModel {
    @NameInMap("OpsId")
    public String opsId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateAKSClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSClusterResponseBody self = new CreateAKSClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAKSClusterResponseBody setOpsId(String opsId) {
        this.opsId = opsId;
        return this;
    }
    public String getOpsId() {
        return this.opsId;
    }

    public CreateAKSClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAKSClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAKSClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
