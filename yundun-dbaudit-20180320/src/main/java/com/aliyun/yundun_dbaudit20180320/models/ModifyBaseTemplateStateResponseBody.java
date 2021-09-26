// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyBaseTemplateStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBaseTemplateStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBaseTemplateStateResponseBody self = new ModifyBaseTemplateStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBaseTemplateStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
