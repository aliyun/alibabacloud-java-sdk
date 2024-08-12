// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbAcIssueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReportUserFbAcIssueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportUserFbAcIssueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbAcIssueResponseBody self = new ReportUserFbAcIssueResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportUserFbAcIssueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportUserFbAcIssueResponseBody setData(ReportUserFbAcIssueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReportUserFbAcIssueResponseBodyData getData() {
        return this.data;
    }

    public ReportUserFbAcIssueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportUserFbAcIssueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReportUserFbAcIssueResponseBodyData extends TeaModel {
        @NameInMap("IssueId")
        public Long issueId;

        public static ReportUserFbAcIssueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReportUserFbAcIssueResponseBodyData self = new ReportUserFbAcIssueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReportUserFbAcIssueResponseBodyData setIssueId(Long issueId) {
            this.issueId = issueId;
            return this;
        }
        public Long getIssueId() {
            return this.issueId;
        }

    }

}
