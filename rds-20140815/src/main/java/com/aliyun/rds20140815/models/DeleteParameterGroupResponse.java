// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupResponse self = new DeleteParameterGroupResponse();
        return TeaModel.build(map, self);
    }

}
