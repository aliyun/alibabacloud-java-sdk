// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableMultiAccountResourceCenterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>767038B7-2027-5508-858B-E213232D57D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the feature. Valid values:</p>
     * <ul>
     * <li>Pending: The feature is being enabled.</li>
     * <li>Enabled: The feature is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
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
