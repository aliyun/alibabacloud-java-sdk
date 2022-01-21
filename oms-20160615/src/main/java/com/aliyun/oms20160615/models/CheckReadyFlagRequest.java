// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class CheckReadyFlagRequest extends TeaModel {
    @NameInMap("Cycles")
    public Integer cycles;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public Long startTime;

    public static CheckReadyFlagRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckReadyFlagRequest self = new CheckReadyFlagRequest();
        return TeaModel.build(map, self);
    }

    public CheckReadyFlagRequest setCycles(Integer cycles) {
        this.cycles = cycles;
        return this;
    }
    public Integer getCycles() {
        return this.cycles;
    }

    public CheckReadyFlagRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CheckReadyFlagRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CheckReadyFlagRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CheckReadyFlagRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CheckReadyFlagRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
