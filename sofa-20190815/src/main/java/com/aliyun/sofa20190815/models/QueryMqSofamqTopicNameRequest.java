// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTopicNameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Num")
    public Long num;

    public static QueryMqSofamqTopicNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTopicNameRequest self = new QueryMqSofamqTopicNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTopicNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqTopicNameRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

}
