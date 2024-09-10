// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B256A525-7E42-4BB9-A27C-9017FDDFF1A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoginSwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginSwitchConfigResponseBody self = new ModifyLoginSwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoginSwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
