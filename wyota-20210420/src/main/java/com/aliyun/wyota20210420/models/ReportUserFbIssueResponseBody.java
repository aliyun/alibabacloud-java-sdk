// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbIssueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReportUserFbIssueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportUserFbIssueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbIssueResponseBody self = new ReportUserFbIssueResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportUserFbIssueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportUserFbIssueResponseBody setData(ReportUserFbIssueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReportUserFbIssueResponseBodyData getData() {
        return this.data;
    }

    public ReportUserFbIssueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportUserFbIssueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReportUserFbIssueResponseBodyData extends TeaModel {
        @NameInMap("IssueId")
        public Integer issueId;

        public static ReportUserFbIssueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReportUserFbIssueResponseBodyData self = new ReportUserFbIssueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReportUserFbIssueResponseBodyData setIssueId(Integer issueId) {
            this.issueId = issueId;
            return this;
        }
        public Integer getIssueId() {
            return this.issueId;
        }

    }

}
