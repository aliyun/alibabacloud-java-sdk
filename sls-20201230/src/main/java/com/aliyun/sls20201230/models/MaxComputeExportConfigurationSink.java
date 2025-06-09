// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfigurationSink extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("bufferInterval")
    public String bufferInterval;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fields")
    public java.util.List<String> fields;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterInvalid")
    public Boolean filterInvalid;

    /**
     * <strong>example:</strong>
     * <p>asdfghjk</p>
     */
    @NameInMap("odpsAccessKeyId")
    @Deprecated
    public String odpsAccessKeyId;

    /**
     * <strong>example:</strong>
     * <p>esasdfghjkl</p>
     */
    @NameInMap("odpsAccessSecret")
    @Deprecated
    public String odpsAccessSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
     */
    @NameInMap("odpsEndpoint")
    public String odpsEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_project</p>
     */
    @NameInMap("odpsProject")
    public String odpsProject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("odpsRolearn")
    public String odpsRolearn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_table</p>
     */
    @NameInMap("odpsTable")
    public String odpsTable;

    /**
     * <strong>example:</strong>
     * <p><a href="http://dt.cn-hangzhou.maxcompute.aliyun-inc.com">http://dt.cn-hangzhou.maxcompute.aliyun-inc.com</a></p>
     */
    @NameInMap("odpsTunnelEndpoint")
    public String odpsTunnelEndpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("partitionColumn")
    public java.util.List<String> partitionColumn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>%Y_%m_%d</p>
     */
    @NameInMap("partitionTimeFormat")
    public String partitionTimeFormat;

    /**
     * <strong>example:</strong>
     * <p>StrfTimeFormat</p>
     */
    @NameInMap("timeFormatType")
    public String timeFormatType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static MaxComputeExportConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
        MaxComputeExportConfigurationSink self = new MaxComputeExportConfigurationSink();
        return TeaModel.build(map, self);
    }

    public MaxComputeExportConfigurationSink setBufferInterval(String bufferInterval) {
        this.bufferInterval = bufferInterval;
        return this;
    }
    public String getBufferInterval() {
        return this.bufferInterval;
    }

    public MaxComputeExportConfigurationSink setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public MaxComputeExportConfigurationSink setFilterInvalid(Boolean filterInvalid) {
        this.filterInvalid = filterInvalid;
        return this;
    }
    public Boolean getFilterInvalid() {
        return this.filterInvalid;
    }

    @Deprecated
    public MaxComputeExportConfigurationSink setOdpsAccessKeyId(String odpsAccessKeyId) {
        this.odpsAccessKeyId = odpsAccessKeyId;
        return this;
    }
    public String getOdpsAccessKeyId() {
        return this.odpsAccessKeyId;
    }

    @Deprecated
    public MaxComputeExportConfigurationSink setOdpsAccessSecret(String odpsAccessSecret) {
        this.odpsAccessSecret = odpsAccessSecret;
        return this;
    }
    public String getOdpsAccessSecret() {
        return this.odpsAccessSecret;
    }

    public MaxComputeExportConfigurationSink setOdpsEndpoint(String odpsEndpoint) {
        this.odpsEndpoint = odpsEndpoint;
        return this;
    }
    public String getOdpsEndpoint() {
        return this.odpsEndpoint;
    }

    public MaxComputeExportConfigurationSink setOdpsProject(String odpsProject) {
        this.odpsProject = odpsProject;
        return this;
    }
    public String getOdpsProject() {
        return this.odpsProject;
    }

    public MaxComputeExportConfigurationSink setOdpsRolearn(String odpsRolearn) {
        this.odpsRolearn = odpsRolearn;
        return this;
    }
    public String getOdpsRolearn() {
        return this.odpsRolearn;
    }

    public MaxComputeExportConfigurationSink setOdpsTable(String odpsTable) {
        this.odpsTable = odpsTable;
        return this;
    }
    public String getOdpsTable() {
        return this.odpsTable;
    }

    public MaxComputeExportConfigurationSink setOdpsTunnelEndpoint(String odpsTunnelEndpoint) {
        this.odpsTunnelEndpoint = odpsTunnelEndpoint;
        return this;
    }
    public String getOdpsTunnelEndpoint() {
        return this.odpsTunnelEndpoint;
    }

    public MaxComputeExportConfigurationSink setPartitionColumn(java.util.List<String> partitionColumn) {
        this.partitionColumn = partitionColumn;
        return this;
    }
    public java.util.List<String> getPartitionColumn() {
        return this.partitionColumn;
    }

    public MaxComputeExportConfigurationSink setPartitionTimeFormat(String partitionTimeFormat) {
        this.partitionTimeFormat = partitionTimeFormat;
        return this;
    }
    public String getPartitionTimeFormat() {
        return this.partitionTimeFormat;
    }

    public MaxComputeExportConfigurationSink setTimeFormatType(String timeFormatType) {
        this.timeFormatType = timeFormatType;
        return this;
    }
    public String getTimeFormatType() {
        return this.timeFormatType;
    }

    public MaxComputeExportConfigurationSink setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
