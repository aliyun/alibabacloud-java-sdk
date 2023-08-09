// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkPathResponseBody extends TeaModel {
    /**
     * <p>The ID of the network path.</p>
     */
    @NameInMap("NetworkPathId")
    public String networkPathId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPathResponseBody self = new CreateNetworkPathResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPathResponseBody setNetworkPathId(String networkPathId) {
        this.networkPathId = networkPathId;
        return this;
    }
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    public CreateNetworkPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
