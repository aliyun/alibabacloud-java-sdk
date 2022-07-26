// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static ModifyClusterDescResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescResponseBody self = new ModifyClusterDescResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
