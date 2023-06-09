// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableMultiAccountResourceCenterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the feature. Valid values:</p>
     * <br>
     * <p>*   Pending: The feature is being enabled.</p>
     * <p>*   Enabled: The feature is enabled.</p>
     */
    @NameInMap("Status")
    public String status;

    public static EnableMultiAccountResourceCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMultiAccountResourceCenterResponseBody self = new EnableMultiAccountResourceCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMultiAccountResourceCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableMultiAccountResourceCenterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
