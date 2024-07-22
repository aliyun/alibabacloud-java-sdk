// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582266750353</p>
     */
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    /**
     * <strong>example:</strong>
     * <p>1582266750353</p>
     */
    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>statistical</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29b52d70-d9fe-4fe0-8476-8aaacbcfdc84</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("TimeUnit")
    public String timeUnit;

    public static ExportStatisticalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportStatisticalDataRequest self = new ExportStatisticalDataRequest();
        return TeaModel.build(map, self);
    }

    public ExportStatisticalDataRequest setBeginTimeLeftRange(Long beginTimeLeftRange) {
        this.beginTimeLeftRange = beginTimeLeftRange;
        return this;
    }
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    public ExportStatisticalDataRequest setBeginTimeRightRange(Long beginTimeRightRange) {
        this.beginTimeRightRange = beginTimeRightRange;
        return this;
    }
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    public ExportStatisticalDataRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportStatisticalDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportStatisticalDataRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
