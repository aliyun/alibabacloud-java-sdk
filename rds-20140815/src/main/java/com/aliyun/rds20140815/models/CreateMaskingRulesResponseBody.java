// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, String> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaskingRulesResponseBody self = new CreateMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaskingRulesResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public CreateMaskingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMaskingRulesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
