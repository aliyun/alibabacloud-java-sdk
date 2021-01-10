// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskresultResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinkaPmdtaskresultResponseBodyResult> result;

    public static QueryLinkeLinkaPmdtaskresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskresultResponseBody self = new QueryLinkeLinkaPmdtaskresultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaPmdtaskresultResponseBody setResult(java.util.List<QueryLinkeLinkaPmdtaskresultResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaPmdtaskresultResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaPmdtaskresultResponseBodyResult extends TeaModel {
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

        public static QueryLinkeLinkaPmdtaskresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaPmdtaskresultResponseBodyResult self = new QueryLinkeLinkaPmdtaskresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setBeginColumn(Long beginColumn) {
            this.beginColumn = beginColumn;
            return this;
        }
        public Long getBeginColumn() {
            return this.beginColumn;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setBeginLine(Long beginLine) {
            this.beginLine = beginLine;
            return this;
        }
        public Long getBeginLine() {
            return this.beginLine;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setVarName(String varName) {
            this.varName = varName;
            return this;
        }
        public String getVarName() {
            return this.varName;
        }

        public QueryLinkeLinkaPmdtaskresultResponseBodyResult setRelatedFiles(java.util.List<String> relatedFiles) {
            this.relatedFiles = relatedFiles;
            return this;
        }
        public java.util.List<String> getRelatedFiles() {
            return this.relatedFiles;
        }

    }

}
