// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteInspectionScheduleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>scheduleId-202604141xxxx</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteInspectionScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionScheduleRequest self = new DeleteInspectionScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionScheduleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInspectionScheduleRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public DeleteInspectionScheduleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
