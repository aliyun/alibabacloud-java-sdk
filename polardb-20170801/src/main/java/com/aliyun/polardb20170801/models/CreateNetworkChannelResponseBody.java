// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateNetworkChannelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F9F1CB1A-B1D5-4EF5-A53A-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkChannelResponseBody self = new CreateNetworkChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
