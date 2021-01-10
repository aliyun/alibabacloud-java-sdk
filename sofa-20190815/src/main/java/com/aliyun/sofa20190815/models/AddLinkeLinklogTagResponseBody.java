// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogTagResponseBody extends TeaModel {
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
    public AddLinkeLinklogTagResponseBodyResult result;

    public static AddLinkeLinklogTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogTagResponseBody self = new AddLinkeLinklogTagResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeLinklogTagResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeLinklogTagResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public AddLinkeLinklogTagResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AddLinkeLinklogTagResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public AddLinkeLinklogTagResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeLinklogTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeLinklogTagResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeLinklogTagResponseBody setResult(AddLinkeLinklogTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeLinklogTagResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeLinklogTagResponseBodyResult extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("RelationId")
        public Long relationId;

        public static AddLinkeLinklogTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeLinklogTagResponseBodyResult self = new AddLinkeLinklogTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeLinklogTagResponseBodyResult setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public AddLinkeLinklogTagResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeLinklogTagResponseBodyResult setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public AddLinkeLinklogTagResponseBodyResult setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

    }

}
