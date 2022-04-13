// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QuerySupplierDetailBySupplierUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, ResultValue> result;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySupplierDetailBySupplierUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierDetailBySupplierUidResponseBody self = new QuerySupplierDetailBySupplierUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySupplierDetailBySupplierUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setResult(java.util.Map<String, ResultValue> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ResultValue> getResult() {
        return this.result;
    }

    public QuerySupplierDetailBySupplierUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
