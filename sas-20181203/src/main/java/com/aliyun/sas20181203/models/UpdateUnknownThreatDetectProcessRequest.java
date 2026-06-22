// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectProcessRequest extends TeaModel {
    /**
     * <p>The process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2026011210040602108912721603151374234</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The remark for the process.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateUnknownThreatDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnknownThreatDetectProcessRequest self = new UpdateUnknownThreatDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUnknownThreatDetectProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateUnknownThreatDetectProcessRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
