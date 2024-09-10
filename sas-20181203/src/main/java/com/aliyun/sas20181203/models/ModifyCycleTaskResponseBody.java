// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCycleTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AA33E30-7192-5648-93CD-D0E476A2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCycleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCycleTaskResponseBody self = new ModifyCycleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCycleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
