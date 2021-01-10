// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdruleresultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeLinkaPmdruleresultsResponseBodyResult> result;

    public static QueryLinkeLinkaPmdruleresultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdruleresultsResponseBody self = new QueryLinkeLinkaPmdruleresultsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaPmdruleresultsResponseBody setResult(java.util.List<QueryLinkeLinkaPmdruleresultsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaPmdruleresultsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaPmdruleresultsResponseBodyResult extends TeaModel {
        @NameInMap("BeginColumn")
        public Long beginColumn;

        @NameInMap("BeginLine")
        public Long beginLine;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndColumn")
        public Long endColumn;

        @NameInMap("EndLine")
        public Long endLine;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("VarName")
        public String varName;

        @NameInMap("RelatedFiles")
        public java.util.List<String> relatedFiles;

        public static QueryLinkeLinkaPmdruleresultsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaPmdruleresultsResponseBodyResult self = new QueryLinkeLinkaPmdruleresultsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setBeginColumn(Long beginColumn) {
            this.beginColumn = beginColumn;
            return this;
        }
        public Long getBeginColumn() {
            return this.beginColumn;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setBeginLine(Long beginLine) {
            this.beginLine = beginLine;
            return this;
        }
        public Long getBeginLine() {
            return this.beginLine;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setVarName(String varName) {
            this.varName = varName;
            return this;
        }
        public String getVarName() {
            return this.varName;
        }

        public QueryLinkeLinkaPmdruleresultsResponseBodyResult setRelatedFiles(java.util.List<String> relatedFiles) {
            this.relatedFiles = relatedFiles;
            return this;
        }
        public java.util.List<String> getRelatedFiles() {
            return this.relatedFiles;
        }

    }

}
