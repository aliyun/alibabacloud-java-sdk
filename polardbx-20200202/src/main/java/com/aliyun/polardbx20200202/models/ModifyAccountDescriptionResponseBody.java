// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyAccountDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponseBody self = new ModifyAccountDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAccountDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountDescriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
