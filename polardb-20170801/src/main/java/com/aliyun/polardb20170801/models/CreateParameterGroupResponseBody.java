// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the parameter template.</p>
     * <br>
     * <p>> You can call the [DescribeParameterGroups](https://help.aliyun.com/document_detail/207178.html) operation to query the details of all parameter templates of a specified region, such as the ID of a parameter template.</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupResponseBody self = new CreateParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupResponseBody setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public CreateParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
