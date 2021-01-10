// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitchangeResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutVcscommitchangeResponseBodyResult> result;

    public static GetLinkeBahamutVcscommitchangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitchangeResponseBody self = new GetLinkeBahamutVcscommitchangeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcscommitchangeResponseBody setResult(java.util.List<GetLinkeBahamutVcscommitchangeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcscommitchangeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcscommitchangeResponseBodyResult extends TeaModel {
        @NameInMap("Amode")
        public String amode;

        @NameInMap("Binary")
        public Boolean binary;

        @NameInMap("Bmode")
        public String bmode;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("FilePathId")
        public String filePathId;

        @NameInMap("FromId")
        public String fromId;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        @NameInMap("ToId")
        public String toId;

        public static GetLinkeBahamutVcscommitchangeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcscommitchangeResponseBodyResult self = new GetLinkeBahamutVcscommitchangeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setBinary(Boolean binary) {
            this.binary = binary;
            return this;
        }
        public Boolean getBinary() {
            return this.binary;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setFilePathId(String filePathId) {
            this.filePathId = filePathId;
            return this;
        }
        public String getFilePathId() {
            return this.filePathId;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public GetLinkeBahamutVcscommitchangeResponseBodyResult setToId(String toId) {
            this.toId = toId;
            return this;
        }
        public String getToId() {
            return this.toId;
        }

    }

}
