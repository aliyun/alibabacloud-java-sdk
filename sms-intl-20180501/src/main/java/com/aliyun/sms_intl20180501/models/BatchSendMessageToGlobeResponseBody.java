// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedList")
    public String failedList;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    @NameInMap("From")
    public String from;

    @NameInMap("SuccessCount")
    public String successCount;

    public static BatchSendMessageToGlobeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeResponseBody self = new BatchSendMessageToGlobeResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public BatchSendMessageToGlobeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSendMessageToGlobeResponseBody setFailedList(String failedList) {
        this.failedList = failedList;
        return this;
    }
    public String getFailedList() {
        return this.failedList;
    }

    public BatchSendMessageToGlobeResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public BatchSendMessageToGlobeResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BatchSendMessageToGlobeResponseBody setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

}
