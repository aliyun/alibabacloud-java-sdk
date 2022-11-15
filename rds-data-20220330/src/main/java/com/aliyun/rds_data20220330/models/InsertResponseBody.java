// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertResult data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InsertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertResponseBody self = new InsertResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertResponseBody setData(InsertResult data) {
        this.data = data;
        return this;
    }
    public InsertResult getData() {
        return this.data;
    }

    public InsertResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
