// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyComponentAssetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This ID is unique to each request and is used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1C5F11E9-464E-51F0-9296-43BB312A0557</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyComponentAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyComponentAssetResponseBody self = new ModifyComponentAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyComponentAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
