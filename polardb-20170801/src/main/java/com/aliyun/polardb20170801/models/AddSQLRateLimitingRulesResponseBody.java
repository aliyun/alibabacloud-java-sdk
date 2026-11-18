// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddSQLRateLimitingRulesResponseBody extends TeaModel {
    /**
     * <p>The message returned by the request.</p>
     * <blockquote>
     * <p>If the request is successful, Successful is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request fails.</p>
     * </li>
     * </ul>
     * 
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
