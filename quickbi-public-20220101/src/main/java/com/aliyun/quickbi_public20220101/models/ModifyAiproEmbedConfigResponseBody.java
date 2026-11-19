// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyAiproEmbedConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46e53746***70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result of the operation. Valid values:</p>
     * <ul>
     * <li>true: The operation is successful.</li>
     * <li>false: The operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyAiproEmbedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiproEmbedConfigResponseBody self = new ModifyAiproEmbedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAiproEmbedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAiproEmbedConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ModifyAiproEmbedConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
