// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RebootECSRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8c96a3fc8a0d4a48b5db5fdb9742fbbc</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1772076782</p>
     */
    @NameInMap("RebootTime")
    public Long rebootTime;

    public static RebootECSRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootECSRequest self = new RebootECSRequest();
        return TeaModel.build(map, self);
    }

    public RebootECSRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RebootECSRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RebootECSRequest setRebootTime(Long rebootTime) {
        this.rebootTime = rebootTime;
        return this;
    }
    public Long getRebootTime() {
        return this.rebootTime;
    }

}
