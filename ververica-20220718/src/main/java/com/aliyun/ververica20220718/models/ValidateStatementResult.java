// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateStatementResult extends TeaModel {
    @NameInMap("errorDetails")
    public ValidationErrorDetails errorDetails;

    /**
     * <strong>example:</strong>
     * <p>&quot;there have some errors&quot;&quot;</p>
     */
    @NameInMap("validationResult")
    public String validationResult;

    public static ValidateStatementResult build(java.util.Map<String, ?> map) throws Exception {
        ValidateStatementResult self = new ValidateStatementResult();
        return TeaModel.build(map, self);
    }

    public ValidateStatementResult setErrorDetails(ValidationErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }
    public ValidationErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    public ValidateStatementResult setValidationResult(String validationResult) {
        this.validationResult = validationResult;
        return this;
    }
    public String getValidationResult() {
        return this.validationResult;
    }

}
