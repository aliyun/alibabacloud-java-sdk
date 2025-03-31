// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance whose groups you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tags")
    public String tags;

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

    public ListGroupIdRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
