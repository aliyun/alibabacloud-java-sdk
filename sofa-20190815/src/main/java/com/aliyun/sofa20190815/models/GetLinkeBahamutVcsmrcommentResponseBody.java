// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrcommentResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutVcsmrcommentResponseBodyResult> result;

    public static GetLinkeBahamutVcsmrcommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrcommentResponseBody self = new GetLinkeBahamutVcsmrcommentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsmrcommentResponseBody setResult(java.util.List<GetLinkeBahamutVcsmrcommentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcsmrcommentResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsmrcommentResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutVcsmrcommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsmrcommentResponseBodyResult self = new GetLinkeBahamutVcsmrcommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setAward(Boolean award) {
            this.award = award;
            return this;
        }
        public Boolean getAward() {
            return this.award;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeBahamutVcsmrcommentResponseBodyResult setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

    }

}
