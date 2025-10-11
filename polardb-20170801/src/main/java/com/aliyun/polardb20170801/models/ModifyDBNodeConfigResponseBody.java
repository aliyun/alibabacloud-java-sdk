// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBNodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeConfigResponseBody self = new ModifyDBNodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
