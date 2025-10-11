// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddSQLRateLimitingRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddSQLRateLimitingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSQLRateLimitingRulesResponseBody self = new AddSQLRateLimitingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSQLRateLimitingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSQLRateLimitingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSQLRateLimitingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
