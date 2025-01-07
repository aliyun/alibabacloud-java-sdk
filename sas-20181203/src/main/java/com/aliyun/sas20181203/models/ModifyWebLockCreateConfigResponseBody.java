// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockCreateConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration ID of the protected directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1404656</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockCreateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockCreateConfigResponseBody self = new ModifyWebLockCreateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockCreateConfigResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ModifyWebLockCreateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
