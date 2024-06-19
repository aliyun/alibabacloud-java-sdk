// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The parameter template ID, which is globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>sys-001*****</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupResponseBody self = new DeleteParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParameterGroupResponseBody setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public DeleteParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
