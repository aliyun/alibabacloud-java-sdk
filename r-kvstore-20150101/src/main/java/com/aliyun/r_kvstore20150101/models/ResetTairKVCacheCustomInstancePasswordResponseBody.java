// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResetTairKVCacheCustomInstancePasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD425AD3-CC7B-4EE2-A5CB-2F61BA73****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetTairKVCacheCustomInstancePasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetTairKVCacheCustomInstancePasswordResponseBody self = new ResetTairKVCacheCustomInstancePasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetTairKVCacheCustomInstancePasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
