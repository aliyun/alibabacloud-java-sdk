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

    public EvaluateDedicatedHostInstanceResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateDedicatedHostInstanceResourceResponse setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public EvaluateDedicatedHostInstanceResourceResponse setAvailable(Integer available) {
        this.available = available;
        return this;
    }
    public Integer getAvailable() {
        return this.available;
    }

}
