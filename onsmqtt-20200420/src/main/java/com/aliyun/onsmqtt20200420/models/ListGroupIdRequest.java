// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance whose groups you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIdRequest self = new ListGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
