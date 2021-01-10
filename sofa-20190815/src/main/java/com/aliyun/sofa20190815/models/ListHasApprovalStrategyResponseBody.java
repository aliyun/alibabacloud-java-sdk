// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasApprovalStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public java.util.List<ListHasApprovalStrategyResponseBodyResultContent> resultContent;

    public static ListHasApprovalStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasApprovalStrategyResponseBody self = new ListHasApprovalStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasApprovalStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasApprovalStrategyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasApprovalStrategyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasApprovalStrategyResponseBody setResultContent(java.util.List<ListHasApprovalStrategyResponseBodyResultContent> resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public java.util.List<ListHasApprovalStrategyResponseBodyResultContent> getResultContent() {
        return this.resultContent;
    }

    public static class ListHasApprovalStrategyResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasApprovalStrategyResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasApprovalStrategyResponseBodyResultContent self = new ListHasApprovalStrategyResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasApprovalStrategyResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasApprovalStrategyResponseBodyResultContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
