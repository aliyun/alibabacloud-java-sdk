// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListFbIssueLabelsByLCResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFbIssueLabelsByLCResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFbIssueLabelsByLCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFbIssueLabelsByLCResponseBody self = new ListFbIssueLabelsByLCResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFbIssueLabelsByLCResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFbIssueLabelsByLCResponseBody setData(ListFbIssueLabelsByLCResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFbIssueLabelsByLCResponseBodyData getData() {
        return this.data;
    }

    public ListFbIssueLabelsByLCResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFbIssueLabelsByLCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFbIssueLabelsByLCResponseBodyData extends TeaModel {
        @NameInMap("IssueLabel")
        public java.util.List<String> issueLabel;

        public static ListFbIssueLabelsByLCResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFbIssueLabelsByLCResponseBodyData self = new ListFbIssueLabelsByLCResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFbIssueLabelsByLCResponseBodyData setIssueLabel(java.util.List<String> issueLabel) {
            this.issueLabel = issueLabel;
            return this;
        }
        public java.util.List<String> getIssueLabel() {
            return this.issueLabel;
        }

    }

}
