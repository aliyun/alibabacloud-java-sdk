// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static ActiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponse self = new ActiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

}
