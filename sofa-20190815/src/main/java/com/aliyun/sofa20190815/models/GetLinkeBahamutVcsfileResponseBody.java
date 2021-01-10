// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsfileResponseBody extends TeaModel {
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
    public GetLinkeBahamutVcsfileResponseBodyResult result;

    public static GetLinkeBahamutVcsfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsfileResponseBody self = new GetLinkeBahamutVcsfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsfileResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsfileResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsfileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsfileResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsfileResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsfileResponseBody setResult(GetLinkeBahamutVcsfileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutVcsfileResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsfileResponseBodyResult extends TeaModel {
        @NameInMap("BlobId")
        public String blobId;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("LastCommitId")
        public String lastCommitId;

        @NameInMap("Ref")
        public String ref;

        @NameInMap("Size")
        public String size;

        public static GetLinkeBahamutVcsfileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsfileResponseBodyResult self = new GetLinkeBahamutVcsfileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setBlobId(String blobId) {
            this.blobId = blobId;
            return this;
        }
        public String getBlobId() {
            return this.blobId;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setLastCommitId(String lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }
        public String getLastCommitId() {
            return this.lastCommitId;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setRef(String ref) {
            this.ref = ref;
            return this;
        }
        public String getRef() {
            return this.ref;
        }

        public GetLinkeBahamutVcsfileResponseBodyResult setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
