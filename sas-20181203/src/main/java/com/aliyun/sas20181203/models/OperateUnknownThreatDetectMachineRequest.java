// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateUnknownThreatDetectMachineRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>restart_study</strong>: Restarts the learning process.</p>
     * </li>
     * <li><p><strong>increment_study</strong>: Starts incremental learning.</p>
     * </li>
     * <li><p><strong>change_status</strong>: Changes the status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>restart_study</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The target status. This parameter applies only when <code>OperateType</code> is set to <code>change_status</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>monitoring</strong>: Monitoring mode.</p>
     * </li>
     * <li><p><strong>blocking</strong>: Blocking mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>monitoring</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of server UUIDs.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static OperateUnknownThreatDetectMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateUnknownThreatDetectMachineRequest self = new OperateUnknownThreatDetectMachineRequest();
        return TeaModel.build(map, self);
    }

    public OperateUnknownThreatDetectMachineRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateUnknownThreatDetectMachineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperateUnknownThreatDetectMachineRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
