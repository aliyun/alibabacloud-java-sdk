// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListFbIssueLabelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFbIssueLabelsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFbIssueLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFbIssueLabelsResponseBody self = new ListFbIssueLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFbIssueLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFbIssueLabelsResponseBody setData(ListFbIssueLabelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFbIssueLabelsResponseBodyData getData() {
        return this.data;
    }

    public ListFbIssueLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFbIssueLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFbIssueLabelsResponseBodyData extends TeaModel {
        @NameInMap("IssueLabel")
        public java.util.List<String> issueLabel;

        public static ListFbIssueLabelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFbIssueLabelsResponseBodyData self = new ListFbIssueLabelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFbIssueLabelsResponseBodyData setIssueLabel(java.util.List<String> issueLabel) {
            this.issueLabel = issueLabel;
            return this;
        }
        public java.util.List<String> getIssueLabel() {
            return this.issueLabel;
        }

    }

}
