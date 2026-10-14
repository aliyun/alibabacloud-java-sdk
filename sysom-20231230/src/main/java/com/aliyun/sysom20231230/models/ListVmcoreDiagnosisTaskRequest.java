// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListVmcoreDiagnosisTaskRequest extends TeaModel {
    /**
     * <p>The number of past days for which to query tasks. Maximum value: 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("days")
    public Long days;

    public static ListVmcoreDiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVmcoreDiagnosisTaskRequest self = new ListVmcoreDiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListVmcoreDiagnosisTaskRequest setDays(Long days) {
        this.days = days;
        return this;
    }
    public Long getDays() {
        return this.days;
    }

}
