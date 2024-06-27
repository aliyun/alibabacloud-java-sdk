// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyReportTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the status of the report task. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportTaskStatus")
    public Integer reportTaskStatus;

    public static ModifyReportTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReportTaskStatusRequest self = new ModifyReportTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReportTaskStatusRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
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
