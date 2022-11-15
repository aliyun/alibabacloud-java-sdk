// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class CommitTransactionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CommitTransactionResult data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CommitTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitTransactionResponseBody self = new CommitTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitTransactionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommitTransactionResponseBody setData(CommitTransactionResult data) {
        this.data = data;
        return this;
    }
    public CommitTransactionResult getData() {
        return this.data;
    }

    public CommitTransactionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CommitTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommitTransactionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
