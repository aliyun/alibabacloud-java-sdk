// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidationErrorDetails extends TeaModel {
    /**
     * <p>The number of the column at which the error starts.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("columnNumber")
    public String columnNumber;

    /**
     * <p>The number of the column at which the error ends.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("endColumnNumber")
    public String endColumnNumber;

    /**
     * <p>The number of the row at which the error ends.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("endLineNumber")
    public String endLineNumber;

    /**
     * <p>The number the row at which the error starts.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("lineNumber")
    public String lineNumber;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
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
