// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateEmbeddedStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D78*********DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of works that are opened or closed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateEmbeddedStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmbeddedStatusResponseBody self = new UpdateEmbeddedStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEmbeddedStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEmbeddedStatusResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public UpdateEmbeddedStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
