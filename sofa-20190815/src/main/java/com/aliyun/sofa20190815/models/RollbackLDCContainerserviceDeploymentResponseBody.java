// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLDCContainerserviceDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RollbackLDCContainerserviceDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackLDCContainerserviceDeploymentResponseBody self = new RollbackLDCContainerserviceDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackLDCContainerserviceDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackLDCContainerserviceDeploymentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackLDCContainerserviceDeploymentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
