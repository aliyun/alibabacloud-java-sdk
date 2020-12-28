// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClientIdList")
    public java.util.List<String> clientIdList;

    public static BatchQuerySessionByClientIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQuerySessionByClientIdsRequest self = new BatchQuerySessionByClientIdsRequest();
        return TeaModel.build(map, self);
    }

    public BatchQuerySessionByClientIdsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchQuerySessionByClientIdsRequest setClientIdList(java.util.List<String> clientIdList) {
        this.clientIdList = clientIdList;
        return this;
    }
    public java.util.List<String> getClientIdList() {
        return this.clientIdList;
    }

}
