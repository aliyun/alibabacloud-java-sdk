// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class GetAliwareReportResponseBody extends TeaModel {
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

    public static GetAliwareReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliwareReportResponseBody self = new GetAliwareReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliwareReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliwareReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAliwareReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAliwareReportResponseBody setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public GetAliwareReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAliwareReportResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
