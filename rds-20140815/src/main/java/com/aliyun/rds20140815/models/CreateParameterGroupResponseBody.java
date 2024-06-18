// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the parameter template. You can call the <a href="https://help.aliyun.com/document_detail/144491.html">DescribeParameterGroups</a> operation to query the IDs of parameter templates.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-q488w14xvsk****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
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
