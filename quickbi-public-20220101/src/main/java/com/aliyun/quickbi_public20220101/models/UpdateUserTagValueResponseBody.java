// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagValueResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46e5374665ba4b679ee22e2a29270</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the result of modifying the user tag. Possible values:</p>
     * <ul>
     * <li>true: Operation succeeded</li>
     * <li>false: Operation failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request was successful. Value range:</p>
     * <ul>
     * <li>true: The request was successful - false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateUserTagValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserTagValueResponseBody self = new UpdateUserTagValueResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserTagValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserTagValueResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateUserTagValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
