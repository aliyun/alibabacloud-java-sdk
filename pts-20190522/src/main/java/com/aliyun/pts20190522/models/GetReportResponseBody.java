// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class GetReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshot")
    public String snapshot;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Summary")
    public String summary;

    public static GetReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportResponseBody self = new GetReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReportResponseBody setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public GetReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetReportResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
