// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyHybridProxyClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8B4B6E6D-B0B0-5F05-A14E-82917D9648EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridProxyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridProxyClusterResponseBody self = new ModifyHybridProxyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridProxyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
