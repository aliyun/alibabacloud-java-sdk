// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    @NameInMap("Available")
    @Validation(required = true)
    public Integer available;

    public static EvaluateDedicatedHostInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceResponse self = new EvaluateDedicatedHostInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

}
