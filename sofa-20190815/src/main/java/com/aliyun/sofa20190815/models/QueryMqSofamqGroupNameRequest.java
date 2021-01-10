// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqGroupNameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Num")
    public Long num;

    public static QueryMqSofamqGroupNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqGroupNameRequest self = new QueryMqSofamqGroupNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqGroupNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqGroupNameRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

}
