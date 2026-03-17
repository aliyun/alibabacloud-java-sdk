// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGEnterpriseCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FBDB18D8-E91E-4978-8D6C-6E2E3EE10133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmartAGEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGEnterpriseCodeResponseBody self = new UpdateSmartAGEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
