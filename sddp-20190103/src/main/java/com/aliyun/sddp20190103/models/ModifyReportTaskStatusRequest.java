// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyReportTaskStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ReportTaskStatus")
    public Integer reportTaskStatus;

    public static ModifyReportTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReportTaskStatusRequest self = new ModifyReportTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReportTaskStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyReportTaskStatusRequest setReportTaskStatus(Integer reportTaskStatus) {
        this.reportTaskStatus = reportTaskStatus;
        return this;
    }
    public Integer getReportTaskStatus() {
        return this.reportTaskStatus;
    }

}
