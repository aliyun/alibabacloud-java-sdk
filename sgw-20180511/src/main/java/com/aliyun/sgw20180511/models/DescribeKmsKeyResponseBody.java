// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeKmsKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsValid")
    public Boolean isValid;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeKmsKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeyResponseBody self = new DescribeKmsKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeKmsKeyResponseBody setIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }
    public Boolean getIsValid() {
        return this.isValid;
    }

    public DescribeKmsKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeKmsKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKmsKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
