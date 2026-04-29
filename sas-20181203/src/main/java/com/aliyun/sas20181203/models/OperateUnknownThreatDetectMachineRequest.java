// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateUnknownThreatDetectMachineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>restart_study</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>monitoring</p>
     */
    @NameInMap("Status")
    public String status;

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
