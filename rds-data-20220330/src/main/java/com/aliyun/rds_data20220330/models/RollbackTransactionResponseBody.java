// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class RollbackTransactionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RollbackTransactionResult data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RollbackTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackTransactionResponseBody self = new RollbackTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackTransactionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RollbackTransactionResponseBody setData(RollbackTransactionResult data) {
        this.data = data;
        return this;
    }
    public RollbackTransactionResult getData() {
        return this.data;
    }

    public RollbackTransactionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackTransactionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
