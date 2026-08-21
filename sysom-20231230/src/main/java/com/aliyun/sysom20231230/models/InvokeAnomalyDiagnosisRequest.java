// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeAnomalyDiagnosisRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The UUID of the anomaly event.</p>
     * 
     * <strong>example:</strong>
     * <p>8047d763-5465-4a8c-b1cd-23f5a8ba2594</p>
     */
    @NameInMap("uuid")
    public String uuid;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static InvokeAnomalyDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAnomalyDiagnosisRequest self = new InvokeAnomalyDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAnomalyDiagnosisRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public InvokeAnomalyDiagnosisRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public InvokeAnomalyDiagnosisRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
