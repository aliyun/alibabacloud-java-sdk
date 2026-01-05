// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class InstanceStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Init Succeed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SlotNum")
    public Integer slotNum;

    /**
     * <strong>example:</strong>
     * <p>20.0G</p>
     */
    @NameInMap("UsedCapacity")
    public String usedCapacity;

    public static InstanceStatus build(java.util.Map<String, ?> map) throws Exception {
        InstanceStatus self = new InstanceStatus();
        return TeaModel.build(map, self);
    }

    public InstanceStatus setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstanceStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstanceStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public InstanceStatus setSlotNum(Integer slotNum) {
        this.slotNum = slotNum;
        return this;
    }
    public Integer getSlotNum() {
        return this.slotNum;
    }

    public InstanceStatus setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }
    public String getUsedCapacity() {
        return this.usedCapacity;
    }

}
