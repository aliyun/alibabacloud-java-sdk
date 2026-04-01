// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the parameter template.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-gfs****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AF26036-B254-4212-B8E4-EFBE818B7FD6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupResponseBody self = new DeleteParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParameterGroupResponseBody setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public DeleteParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
