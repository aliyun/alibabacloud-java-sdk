// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetTrafficMirrorServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the traffic mirroring feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTrafficMirrorServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficMirrorServiceStatusResponseBody self = new GetTrafficMirrorServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficMirrorServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetTrafficMirrorServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
