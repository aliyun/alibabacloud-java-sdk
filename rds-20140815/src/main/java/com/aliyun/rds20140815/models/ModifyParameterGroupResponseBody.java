// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupResponseBody self = new ModifyParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParameterGroupResponseBody setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
