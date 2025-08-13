// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskCountRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Data source configuration</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("dataSourceConfig")
    public String dataSourceConfig;

    /**
     * <p>Data source type</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>Task end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1740016411000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ayfofy4941</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Filter</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;left&quot;:&quot;score&quot;,&quot;operate&quot;:&quot;bw&quot;,&quot;right&quot;:&quot;222,333&quot;}</p>
     */
    @NameInMap("filtersStr")
    public String filtersStr;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Task start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739496651000</p>
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
