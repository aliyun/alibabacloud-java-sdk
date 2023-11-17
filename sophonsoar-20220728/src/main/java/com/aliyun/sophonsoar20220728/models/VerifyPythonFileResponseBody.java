// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPythonFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Syntax")
    public java.util.List<VerifyPythonFileResponseBodySyntax> syntax;

    public static VerifyPythonFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyPythonFileResponseBody self = new VerifyPythonFileResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyPythonFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyPythonFileResponseBody setSyntax(java.util.List<VerifyPythonFileResponseBodySyntax> syntax) {
        this.syntax = syntax;
        return this;
    }
    public java.util.List<VerifyPythonFileResponseBodySyntax> getSyntax() {
        return this.syntax;
    }

    public static class VerifyPythonFileResponseBodySyntax extends TeaModel {
        @NameInMap("EndColumn")
        public Integer endColumn;

        @NameInMap("EndLineNumber")
        public Integer endLineNumber;

        @NameInMap("Message")
        public String message;

        @NameInMap("Severity")
        public Integer severity;

        @NameInMap("StartColumn")
        public Integer startColumn;

        @NameInMap("StartLineNumber")
        public Integer startLineNumber;

        public static VerifyPythonFileResponseBodySyntax build(java.util.Map<String, ?> map) throws Exception {
            VerifyPythonFileResponseBodySyntax self = new VerifyPythonFileResponseBodySyntax();
            return TeaModel.build(map, self);
        }

        public VerifyPythonFileResponseBodySyntax setEndColumn(Integer endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Integer getEndColumn() {
            return this.endColumn;
        }

        public VerifyPythonFileResponseBodySyntax setEndLineNumber(Integer endLineNumber) {
            this.endLineNumber = endLineNumber;
            return this;
        }
        public Integer getEndLineNumber() {
            return this.endLineNumber;
        }

        public VerifyPythonFileResponseBodySyntax setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public VerifyPythonFileResponseBodySyntax setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

        public VerifyPythonFileResponseBodySyntax setStartColumn(Integer startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Integer getStartColumn() {
            return this.startColumn;
        }

        public VerifyPythonFileResponseBodySyntax setStartLineNumber(Integer startLineNumber) {
            this.startLineNumber = startLineNumber;
            return this;
        }
        public Integer getStartLineNumber() {
            return this.startLineNumber;
        }

    }

}
