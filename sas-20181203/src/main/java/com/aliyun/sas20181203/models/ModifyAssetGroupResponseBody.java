// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAssetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetGroupResponseBody self = new ModifyAssetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAssetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
