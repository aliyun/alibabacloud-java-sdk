// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIntranetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetAttributeResponseBody self = new ModifyIntranetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
