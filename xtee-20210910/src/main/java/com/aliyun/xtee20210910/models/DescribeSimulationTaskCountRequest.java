// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskCountRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("dataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("filtersStr")
    public String filtersStr;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static DescribeSimulationTaskCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationTaskCountRequest self = new DescribeSimulationTaskCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationTaskCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSimulationTaskCountRequest setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public DescribeSimulationTaskCountRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeSimulationTaskCountRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSimulationTaskCountRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeSimulationTaskCountRequest setFiltersStr(String filtersStr) {
        this.filtersStr = filtersStr;
        return this;
    }
    public String getFiltersStr() {
        return this.filtersStr;
    }

    public DescribeSimulationTaskCountRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSimulationTaskCountRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
