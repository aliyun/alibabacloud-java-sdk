// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitcommentResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutVcscommitcommentResponseBodyResult> result;

    public static GetLinkeBahamutVcscommitcommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitcommentResponseBody self = new GetLinkeBahamutVcscommitcommentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcscommitcommentResponseBody setResult(java.util.List<GetLinkeBahamutVcscommitcommentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcscommitcommentResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcscommitcommentResponseBodyResult extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("Award")
        public Boolean award;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("Note")
        public String note;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        public static GetLinkeBahamutVcscommitcommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcscommitcommentResponseBodyResult self = new GetLinkeBahamutVcscommitcommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setAward(Boolean award) {
            this.award = award;
            return this;
        }
        public Boolean getAward() {
            return this.award;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeBahamutVcscommitcommentResponseBodyResult setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

    }

}
