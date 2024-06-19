// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The parameter template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroupName</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AD425AD3-CC7B-4EE2-A5CB-2F61BA73****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupResponseBody self = new ModifyParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParameterGroupResponseBody setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public ModifyParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
