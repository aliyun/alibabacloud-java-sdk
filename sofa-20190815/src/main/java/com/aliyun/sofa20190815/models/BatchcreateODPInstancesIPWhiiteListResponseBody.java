// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateODPInstancesIPWhiiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchcreateODPInstancesIPWhiiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateODPInstancesIPWhiiteListResponseBody self = new BatchcreateODPInstancesIPWhiiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchcreateODPInstancesIPWhiiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchcreateODPInstancesIPWhiiteListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchcreateODPInstancesIPWhiiteListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
