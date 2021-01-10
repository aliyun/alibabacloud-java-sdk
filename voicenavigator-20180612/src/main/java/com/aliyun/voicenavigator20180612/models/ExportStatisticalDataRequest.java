// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TimeUnit")
    public String timeUnit;

    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    public static ExportStatisticalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportStatisticalDataRequest self = new ExportStatisticalDataRequest();
        return TeaModel.build(map, self);
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

    public ExportStatisticalDataRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
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

}
