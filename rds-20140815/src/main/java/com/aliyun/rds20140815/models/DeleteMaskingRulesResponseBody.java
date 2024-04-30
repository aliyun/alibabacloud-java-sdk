// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteMaskingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, String> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DeleteMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaskingRulesResponseBody self = new DeleteMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaskingRulesResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public DeleteMaskingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMaskingRulesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
