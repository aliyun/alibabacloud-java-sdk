// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogIndicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public AddLinkeLinklogIndicationResponseBodyResult result;

    public static AddLinkeLinklogIndicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogIndicationResponseBody self = new AddLinkeLinklogIndicationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogIndicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeLinklogIndicationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeLinklogIndicationResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public AddLinkeLinklogIndicationResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AddLinkeLinklogIndicationResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public AddLinkeLinklogIndicationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeLinklogIndicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeLinklogIndicationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeLinklogIndicationResponseBody setResult(AddLinkeLinklogIndicationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeLinklogIndicationResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeLinklogIndicationResponseBodyResult extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("Conditions")
        public java.util.List<String> conditions;

        @NameInMap("Id")
        public Long id;

        public static AddLinkeLinklogIndicationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeLinklogIndicationResponseBodyResult self = new AddLinkeLinklogIndicationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeLinklogIndicationResponseBodyResult setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public AddLinkeLinklogIndicationResponseBodyResult setConditions(java.util.List<String> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<String> getConditions() {
            return this.conditions;
        }

        public AddLinkeLinklogIndicationResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
