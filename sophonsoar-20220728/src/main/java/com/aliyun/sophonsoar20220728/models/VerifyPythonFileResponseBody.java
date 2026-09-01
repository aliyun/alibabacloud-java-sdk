// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPythonFileResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F72685FB-A6E6-5A9A-97F7-6DC1056E63CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result set of the Python code verification. If this parameter is empty, the code syntax is correct.</p>
     */
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
        /**
         * <p>The ending column number of the code that contains an error.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("EndColumn")
        public Integer endColumn;

        /**
         * <p>The ending line number of the code that contains an error.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("EndLineNumber")
        public Integer endLineNumber;

        /**
         * <p>The error message for the code.</p>
         * 
         * <strong>example:</strong>
         * <p>undefined name \&quot;ab\&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The error level of the code.</p>
         * <ul>
         * <li><p>4: General error</p>
         * </li>
         * <li><p>8: Critical error</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Severity")
        public Integer severity;

        /**
         * <p>The starting column number of the code that contains an error.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StartColumn")
        public Integer startColumn;

        /**
         * <p>The starting line number of the code that contains an error.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
