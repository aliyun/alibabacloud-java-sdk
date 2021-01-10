// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqTraceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueryId")
    public String queryId;

    public static DeleteMqSofamqTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqTraceRequest self = new DeleteMqSofamqTraceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMqSofamqTraceRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
