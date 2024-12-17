// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairKVCacheCustomInstanceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2FF6158E-3394-4A90-B634-79C49184****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTairKVCacheCustomInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairKVCacheCustomInstanceAttributeResponseBody self = new ModifyTairKVCacheCustomInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTairKVCacheCustomInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
