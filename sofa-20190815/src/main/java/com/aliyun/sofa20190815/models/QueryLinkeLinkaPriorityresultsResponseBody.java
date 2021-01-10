// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPriorityresultsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinkaPriorityresultsResponseBodyResult> result;

    public static QueryLinkeLinkaPriorityresultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPriorityresultsResponseBody self = new QueryLinkeLinkaPriorityresultsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaPriorityresultsResponseBody setResult(java.util.List<QueryLinkeLinkaPriorityresultsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaPriorityresultsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaPriorityresultsResponseBodyResult extends TeaModel {
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

        public static QueryLinkeLinkaPriorityresultsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaPriorityresultsResponseBodyResult self = new QueryLinkeLinkaPriorityresultsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setBeginColumn(Long beginColumn) {
            this.beginColumn = beginColumn;
            return this;
        }
        public Long getBeginColumn() {
            return this.beginColumn;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setBeginLine(Long beginLine) {
            this.beginLine = beginLine;
            return this;
        }
        public Long getBeginLine() {
            return this.beginLine;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setVarName(String varName) {
            this.varName = varName;
            return this;
        }
        public String getVarName() {
            return this.varName;
        }

        public QueryLinkeLinkaPriorityresultsResponseBodyResult setRelatedFiles(java.util.List<String> relatedFiles) {
            this.relatedFiles = relatedFiles;
            return this;
        }
        public java.util.List<String> getRelatedFiles() {
            return this.relatedFiles;
        }

    }

}
