// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesResponseBody extends TeaModel {
    /**
     * <p>The message that is returned for the request.</p>
     * <br>
     * <p>> If the request is successful, Successful is returned. If the request fails, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid value:</p>
     * <br>
     * <p>*   **true**:</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesResponseBody self = new ModifyMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyMaskingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
