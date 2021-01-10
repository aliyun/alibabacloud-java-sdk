// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmergerequestmrcommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult> result;

    public static GetLinkeBahamutVcsmergerequestmrcommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmergerequestmrcommitResponseBody self = new GetLinkeBahamutVcsmergerequestmrcommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsmergerequestmrcommitResponseBody setResult(java.util.List<GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult extends TeaModel {
        @NameInMap("AuthoredData")
        public Long authoredData;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult self = new GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setAuthoredData(Long authoredData) {
            this.authoredData = authoredData;
            return this;
        }
        public Long getAuthoredData() {
            return this.authoredData;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetLinkeBahamutVcsmergerequestmrcommitResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
