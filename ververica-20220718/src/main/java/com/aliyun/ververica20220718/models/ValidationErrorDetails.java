// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidationErrorDetails extends TeaModel {
    @NameInMap("columnNumber")
    public String columnNumber;

    @NameInMap("endColumnNumber")
    public String endColumnNumber;

    @NameInMap("endLineNumber")
    public String endLineNumber;

    @NameInMap("lineNumber")
    public String lineNumber;

    @NameInMap("message")
    public String message;

    public static ValidationErrorDetails build(java.util.Map<String, ?> map) throws Exception {
        ValidationErrorDetails self = new ValidationErrorDetails();
        return TeaModel.build(map, self);
    }

    public ValidationErrorDetails setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
        return this;
    }
    public String getColumnNumber() {
        return this.columnNumber;
    }

    public ValidationErrorDetails setEndColumnNumber(String endColumnNumber) {
        this.endColumnNumber = endColumnNumber;
        return this;
    }
    public String getEndColumnNumber() {
        return this.endColumnNumber;
    }

    public ValidationErrorDetails setEndLineNumber(String endLineNumber) {
        this.endLineNumber = endLineNumber;
        return this;
    }
    public String getEndLineNumber() {
        return this.endLineNumber;
    }

    public ValidationErrorDetails setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
    public String getLineNumber() {
        return this.lineNumber;
    }

    public ValidationErrorDetails setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
