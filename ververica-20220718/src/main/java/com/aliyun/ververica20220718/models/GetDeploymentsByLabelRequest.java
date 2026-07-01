// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentsByLabelRequest extends TeaModel {
    /**
     * <p>Specifies whether to exclude job summary information, such as jobName and status, from the response. If set to true, the response includes only the JobId. This improves performance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreJobSummary")
    public Boolean ignoreJobSummary;

    /**
     * <p>Specifies whether to exclude resource configuration information, such as parallelism and the number of CUs, from the response. This reduces the size of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreResourceSetting")
    public Boolean ignoreResourceSetting;

    /**
     * <p>The label key used for filtering.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("labelKey")
    public String labelKey;

    /**
     * <p>The label value. You can specify multiple values separated by commas (,) to create an OR condition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("labelValue")
    public String labelValue;

    public static GetDeploymentsByLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentsByLabelRequest self = new GetDeploymentsByLabelRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentsByLabelRequest setIgnoreJobSummary(Boolean ignoreJobSummary) {
        this.ignoreJobSummary = ignoreJobSummary;
        return this;
    }
    public Boolean getIgnoreJobSummary() {
        return this.ignoreJobSummary;
    }

    public GetDeploymentsByLabelRequest setIgnoreResourceSetting(Boolean ignoreResourceSetting) {
        this.ignoreResourceSetting = ignoreResourceSetting;
        return this;
    }
    public Boolean getIgnoreResourceSetting() {
        return this.ignoreResourceSetting;
    }

    public GetDeploymentsByLabelRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public GetDeploymentsByLabelRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
