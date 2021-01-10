// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskIssueDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cycle")
    public String cycle;

    @NameInMap("IssueDataId")
    public String issueDataId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Heads")
    public java.util.List<String> heads;

    @NameInMap("Values")
    public java.util.List<GetClriskIssueDataResponseBodyValues> values;

    public static GetClriskIssueDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskIssueDataResponseBody self = new GetClriskIssueDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskIssueDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskIssueDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskIssueDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskIssueDataResponseBody setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public GetClriskIssueDataResponseBody setIssueDataId(String issueDataId) {
        this.issueDataId = issueDataId;
        return this;
    }
    public String getIssueDataId() {
        return this.issueDataId;
    }

    public GetClriskIssueDataResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetClriskIssueDataResponseBody setHeads(java.util.List<String> heads) {
        this.heads = heads;
        return this;
    }
    public java.util.List<String> getHeads() {
        return this.heads;
    }

    public GetClriskIssueDataResponseBody setValues(java.util.List<GetClriskIssueDataResponseBodyValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<GetClriskIssueDataResponseBodyValues> getValues() {
        return this.values;
    }

    public static class GetClriskIssueDataResponseBodyValues extends TeaModel {
        @NameInMap("Names")
        public java.util.List<String> names;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetClriskIssueDataResponseBodyValues build(java.util.Map<String, ?> map) throws Exception {
            GetClriskIssueDataResponseBodyValues self = new GetClriskIssueDataResponseBodyValues();
            return TeaModel.build(map, self);
        }

        public GetClriskIssueDataResponseBodyValues setNames(java.util.List<String> names) {
            this.names = names;
            return this;
        }
        public java.util.List<String> getNames() {
            return this.names;
        }

        public GetClriskIssueDataResponseBodyValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
