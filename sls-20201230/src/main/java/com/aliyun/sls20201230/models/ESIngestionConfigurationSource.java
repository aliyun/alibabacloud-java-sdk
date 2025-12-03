// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ESIngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BootstrapServers")
    public String bootstrapServers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectorMode")
    public String connectorMode;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Index")
    public String index;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxDataDelaySec")
    public Long maxDataDelaySec;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MinFragRangeSec")
    public Long minFragRangeSec;

    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TimeFieldName")
    public String timeFieldName;

    @NameInMap("TimeFormat")
    public String timeFormat;

    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    public static ESIngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        ESIngestionConfigurationSource self = new ESIngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public ESIngestionConfigurationSource setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
        return this;
    }
    public String getBootstrapServers() {
        return this.bootstrapServers;
    }

    public ESIngestionConfigurationSource setConnectorMode(String connectorMode) {
        this.connectorMode = connectorMode;
        return this;
    }
    public String getConnectorMode() {
        return this.connectorMode;
    }

    public ESIngestionConfigurationSource setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ESIngestionConfigurationSource setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public ESIngestionConfigurationSource setMaxDataDelaySec(Long maxDataDelaySec) {
        this.maxDataDelaySec = maxDataDelaySec;
        return this;
    }
    public Long getMaxDataDelaySec() {
        return this.maxDataDelaySec;
    }

    public ESIngestionConfigurationSource setMinFragRangeSec(Long minFragRangeSec) {
        this.minFragRangeSec = minFragRangeSec;
        return this;
    }
    public Long getMinFragRangeSec() {
        return this.minFragRangeSec;
    }

    public ESIngestionConfigurationSource setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ESIngestionConfigurationSource setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ESIngestionConfigurationSource setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ESIngestionConfigurationSource setTimeFieldName(String timeFieldName) {
        this.timeFieldName = timeFieldName;
        return this;
    }
    public String getTimeFieldName() {
        return this.timeFieldName;
    }

    public ESIngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public ESIngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public ESIngestionConfigurationSource setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ESIngestionConfigurationSource setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
