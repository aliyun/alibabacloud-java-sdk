// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportDeviceOtaInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportDeviceOtaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportDeviceOtaInfoResponseBody self = new ReportDeviceOtaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportDeviceOtaInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportDeviceOtaInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportDeviceOtaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
