// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyReportTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The status to set for the report task. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disable</p>
     * </li>
     * <li><p><strong>1</strong>: Enable</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
