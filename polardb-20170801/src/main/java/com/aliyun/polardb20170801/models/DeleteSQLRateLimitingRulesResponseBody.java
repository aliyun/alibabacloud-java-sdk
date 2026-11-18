// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteSQLRateLimitingRulesResponseBody extends TeaModel {
    /**
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <code>Successful</code> is returned. If the request fails, an error message such as an error code is returned.</p>
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
     * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
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

    public static DeleteSQLRateLimitingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSQLRateLimitingRulesResponseBody self = new DeleteSQLRateLimitingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSQLRateLimitingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSQLRateLimitingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSQLRateLimitingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
