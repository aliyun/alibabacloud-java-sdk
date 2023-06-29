// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyReportTaskStatusRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the status of the report task. Valid values:</p>
     * <br>
     * <p>*   **0**: disabled</p>
     * <p>*   **1**: enabled</p>
     * <br>
     * <p>> This parameter is required.</p>
     */
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
