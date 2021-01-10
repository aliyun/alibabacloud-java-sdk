// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqLinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqLinkRequest self = new QueryMqSofamqLinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
