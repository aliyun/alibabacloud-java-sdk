// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableResourceCenterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45357BEF-AB50-5E4D-B05D-5A882A4BE924</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The activation status of the service. Valid values:</p>
     * <ul>
     * <li>Pending: The service is being activated.</li>
     * <li>Enabled: The service is activated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("Status")
    public String status;

    public static EnableResourceCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceCenterResponseBody self = new EnableResourceCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableResourceCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableResourceCenterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
