// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public java.util.List<QueryHasApprovalStatusResponseBodyResultContent> resultContent;

    public static QueryHasApprovalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalStatusResponseBody self = new QueryHasApprovalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasApprovalStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasApprovalStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasApprovalStatusResponseBody setResultContent(java.util.List<QueryHasApprovalStatusResponseBodyResultContent> resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public java.util.List<QueryHasApprovalStatusResponseBodyResultContent> getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasApprovalStatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasApprovalStatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalStatusResponseBodyResultContent self = new QueryHasApprovalStatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalStatusResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalStatusResponseBodyResultContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
