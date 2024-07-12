// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteFeatureViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BF349686-C932-55B5-9B31-DAFA395C0E06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFeatureViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureViewResponseBody self = new DeleteFeatureViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
