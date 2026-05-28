// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfigurationSink extends TeaModel {
    /**
     * <p>Specifies the minimum time granularity between two data shipping jobs. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>1800 (default)</li>
     * <li>3600</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("bufferInterval")
    public String bufferInterval;

    /**
     * <p>The fields that you want to ship.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("fields")
    public java.util.List<String> fields;

    /**
     * <p>Specifies whether to filter the invalid content.</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterInvalid")
    public Boolean filterInvalid;

    /**
     * <p>The AccessKey ID used to write data to MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>axxxxxxxxxxxb</p>
     */
    @NameInMap("odpsAccessKeyId")
    @Deprecated
    public String odpsAccessKeyId;

    /**
     * <p>The AccessKey secret used to write data to MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>aaxxxxxxxxxxxxxxxxxxxxxbb</p>
     */
    @NameInMap("odpsAccessSecret")
    @Deprecated
    public String odpsAccessSecret;

    /**
     * <p>The endpoint of MaxCompute.</p>
     * <ul>
     * <li>⚠️Note: The endpoint of MaxCompute must be the same as that of the Simple Log Service project.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://service.cn-hangzhou-intranet.maxcompute.aliyun-inc.com/api">https://service.cn-hangzhou-intranet.maxcompute.aliyun-inc.com/api</a></p>
     */
    @NameInMap("odpsEndpoint")
    public String odpsEndpoint;

    /**
     * <p>The name of the MaxCompute project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_project</p>
     */
    @NameInMap("odpsProject")
    public String odpsProject;

    /**
     * <p>The Resource Access Management (RAM) role the data shipping job assumes to write data to MaxCompute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxxxxxx</p>
     */
    @NameInMap("odpsRolearn")
    public String odpsRolearn;

    /**
     * <p>The name of the MaxCompute table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_table</p>
     */
    @NameInMap("odpsTable")
    public String odpsTable;

    /**
     * <p>The Tunnel endpoint of MaxCompute.</p>
     * <ul>
     * <li>⚠️Note: The Tunnel endpoint of MaxCompute must be the same as that of the Simple Log Service project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dt.cn-hangzhou-intranet.maxcompute.aliyun-inc.com">https://dt.cn-hangzhou-intranet.maxcompute.aliyun-inc.com</a></p>
     */
    @NameInMap("odpsTunnelEndpoint")
    public String odpsTunnelEndpoint;

    /**
     * <p>The partition key columns that you want to ship.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("partitionColumn")
    public java.util.List<String> partitionColumn;

    /**
     * <p>The time partition format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>%Y_%m_%d</p>
     */
    @NameInMap("partitionTimeFormat")
    public String partitionTimeFormat;

    /**
     * <p>The time partition type. Valid values:</p>
     * <ul>
     * <li>StrfTimeFormat (default)</li>
     * <li>JavaSimpleDateFormat</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StrfTimeFormat</p>
     */
    @NameInMap("timeFormatType")
    public String timeFormatType;

    /**
     * <p>The time zone.</p>
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
