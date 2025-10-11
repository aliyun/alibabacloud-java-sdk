// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateExtensionsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A83B6055-F891-5596-96E3-52D62567DFBB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtensionsResponseBody self = new UpdateExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
