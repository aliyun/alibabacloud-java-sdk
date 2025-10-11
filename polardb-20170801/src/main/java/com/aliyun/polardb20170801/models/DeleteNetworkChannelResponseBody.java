// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteNetworkChannelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkChannelResponseBody self = new DeleteNetworkChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
