// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListVmcoreDiagnosisTaskRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The number of past days to query tasks for, up to a maximum of 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("days")
    public Long days;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static ListVmcoreDiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVmcoreDiagnosisTaskRequest self = new ListVmcoreDiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListVmcoreDiagnosisTaskRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public ListVmcoreDiagnosisTaskRequest setDays(Long days) {
        this.days = days;
        return this;
    }
    public Long getDays() {
        return this.days;
    }

    public ListVmcoreDiagnosisTaskRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
