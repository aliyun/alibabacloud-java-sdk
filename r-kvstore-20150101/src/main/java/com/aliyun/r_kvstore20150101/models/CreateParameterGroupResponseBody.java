// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>g-51ii2ienn0dg0xi8****</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <strong>example:</strong>
     * <p>62DA5BE5-F9C9-527C-ACCB-4D783C297A3A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupResponseBody self = new CreateParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupResponseBody setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public CreateParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
