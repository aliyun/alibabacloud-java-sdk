// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The parameter template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-13ppdh****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>857DC00B-7B85-4853-8B27-AD65EB618BC6</p>
     */
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
