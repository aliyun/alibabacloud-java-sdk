// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20220920.models;

import com.aliyun.tea.*;

public class GetResellerBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResellerBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResellerBillResponseBody self = new GetResellerBillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResellerBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResellerBillResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetResellerBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResellerBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
