// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("FlowLogId")
    @Validation(required = true)
    public String flowLogId;

    public static CreateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponse self = new CreateFlowLogResponse();
        return TeaModel.build(map, self);
    }

}
