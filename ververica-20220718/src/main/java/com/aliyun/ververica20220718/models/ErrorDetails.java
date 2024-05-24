// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ErrorDetails extends TeaModel {
    @NameInMap("columnNumber")
    public String columnNumber;

    @NameInMap("endColumnNumber")
    public String endColumnNumber;

    @NameInMap("endLineNumber")
    public String endLineNumber;

    @NameInMap("invalidflinkConf")
    public java.util.List<String> invalidflinkConf;

    @NameInMap("lineNumber")
    public String lineNumber;

    @NameInMap("message")
    public String message;

    public static ErrorDetails build(java.util.Map<String, ?> map) throws Exception {
        ErrorDetails self = new ErrorDetails();
        return TeaModel.build(map, self);
    }

    public ErrorDetails setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
        return this;
    }
    public String getColumnNumber() {
        return this.columnNumber;
    }

    public ErrorDetails setEndColumnNumber(String endColumnNumber) {
        this.endColumnNumber = endColumnNumber;
        return this;
    }
    public String getEndColumnNumber() {
        return this.endColumnNumber;
    }

    public ErrorDetails setEndLineNumber(String endLineNumber) {
        this.endLineNumber = endLineNumber;
        return this;
    }
    public String getEndLineNumber() {
        return this.endLineNumber;
    }

    public ErrorDetails setInvalidflinkConf(java.util.List<String> invalidflinkConf) {
        this.invalidflinkConf = invalidflinkConf;
        return this;
    }
    public java.util.List<String> getInvalidflinkConf() {
        return this.invalidflinkConf;
    }

    public ErrorDetails setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
    public String getLineNumber() {
        return this.lineNumber;
    }

    public ErrorDetails setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
