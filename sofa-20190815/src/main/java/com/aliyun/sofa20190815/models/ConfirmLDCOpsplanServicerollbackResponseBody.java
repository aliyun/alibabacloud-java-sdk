// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLDCOpsplanServicerollbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ConfirmLDCOpsplanServicerollbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLDCOpsplanServicerollbackResponseBody self = new ConfirmLDCOpsplanServicerollbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmLDCOpsplanServicerollbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmLDCOpsplanServicerollbackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmLDCOpsplanServicerollbackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
