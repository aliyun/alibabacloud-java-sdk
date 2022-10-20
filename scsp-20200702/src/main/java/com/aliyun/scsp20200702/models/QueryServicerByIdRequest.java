// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServicerId")
    public Long servicerId;

    public static QueryServicerByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByIdRequest self = new QueryServicerByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServicerByIdRequest setServicerId(Long servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public Long getServicerId() {
        return this.servicerId;
    }

}
