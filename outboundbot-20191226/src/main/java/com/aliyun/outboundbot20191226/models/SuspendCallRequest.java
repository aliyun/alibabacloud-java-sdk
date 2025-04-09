// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CalledNumbers")
    public java.util.List<String> calledNumbers;

    /**
     * <strong>example:</strong>
     * <p>f745881b-343d-43e4-9c51-31b7b063031c</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a5fc6490-ef1e-4666-870a-07a4e586c414</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SuspendCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendCallRequest self = new SuspendCallRequest();
        return TeaModel.build(map, self);
    }

    public SuspendCallRequest setCalledNumbers(java.util.List<String> calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }
    public java.util.List<String> getCalledNumbers() {
        return this.calledNumbers;
    }

    public SuspendCallRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SuspendCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
