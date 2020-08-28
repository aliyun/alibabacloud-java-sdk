// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static DeleteFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowLogResponse self = new DeleteFlowLogResponse();
        return TeaModel.build(map, self);
    }

}
