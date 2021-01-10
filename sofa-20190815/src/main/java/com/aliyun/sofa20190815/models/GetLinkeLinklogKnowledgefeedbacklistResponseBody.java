// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgefeedbacklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult result;

    public static GetLinkeLinklogKnowledgefeedbacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgefeedbacklistResponseBody self = new GetLinkeLinklogKnowledgefeedbacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponseBody setResult(GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginText")
        public String beginText;

        @NameInMap("End")
        public Long end;

        @NameInMap("EndText")
        public String endText;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("StoreIds")
        public Long storeIds;

        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("Fields")
        public java.util.List<String> fields;

        @NameInMap("List")
        public java.util.List<String> list;

        public static GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult self = new GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setBeginText(String beginText) {
            this.beginText = beginText;
            return this;
        }
        public String getBeginText() {
            return this.beginText;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setEndText(String endText) {
            this.endText = endText;
            return this;
        }
        public String getEndText() {
            return this.endText;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setStoreIds(Long storeIds) {
            this.storeIds = storeIds;
            return this;
        }
        public Long getStoreIds() {
            return this.storeIds;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public GetLinkeLinklogKnowledgefeedbacklistResponseBodyResult setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
