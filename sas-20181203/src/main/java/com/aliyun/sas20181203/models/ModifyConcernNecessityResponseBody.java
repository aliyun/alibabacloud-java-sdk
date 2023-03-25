// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyConcernNecessityResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyConcernNecessityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyConcernNecessityResponseBody self = new ModifyConcernNecessityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyConcernNecessityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
