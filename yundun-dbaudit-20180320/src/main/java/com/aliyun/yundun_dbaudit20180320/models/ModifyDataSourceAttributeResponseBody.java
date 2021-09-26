// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyDataSourceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataSourceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceAttributeResponseBody self = new ModifyDataSourceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
