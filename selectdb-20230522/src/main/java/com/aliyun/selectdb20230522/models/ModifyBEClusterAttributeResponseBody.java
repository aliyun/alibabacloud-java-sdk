// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyBEClusterAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBEClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBEClusterAttributeResponseBody self = new ModifyBEClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBEClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
