// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayClassesResponseBody extends TeaModel {
    @NameInMap("Classes")
    public String classes;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayClassesResponseBody self = new DescribeGatewayClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayClassesResponseBody setClasses(String classes) {
        this.classes = classes;
        return this;
    }
    public String getClasses() {
        return this.classes;
    }

    public DescribeGatewayClassesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayClassesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayClassesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
