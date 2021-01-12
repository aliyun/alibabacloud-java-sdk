// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("Available")
    public Integer available;

    public static EvaluateDedicatedHostInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceResponseBody self = new EvaluateDedicatedHostInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateDedicatedHostInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateDedicatedHostInstanceResourceResponseBody setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public EvaluateDedicatedHostInstanceResourceResponseBody setAvailable(Integer available) {
        this.available = available;
        return this;
    }
    public Integer getAvailable() {
        return this.available;
    }

}
