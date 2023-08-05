// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the network objects are removed. Valid values:</p>
     * <br>
     * <p>*   **true**: The network objects are removed.</p>
     * <p>*   **false**: The network objects fail to be removed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteInterceptionTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionTargetResponseBody self = new DeleteInterceptionTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInterceptionTargetResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
