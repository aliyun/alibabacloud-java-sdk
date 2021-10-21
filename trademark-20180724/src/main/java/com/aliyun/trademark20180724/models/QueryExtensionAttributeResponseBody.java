// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryExtensionAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("AttributeValue")
    public String attributeValue;

    public static QueryExtensionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExtensionAttributeResponseBody self = new QueryExtensionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExtensionAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryExtensionAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryExtensionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExtensionAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryExtensionAttributeResponseBody setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

}
