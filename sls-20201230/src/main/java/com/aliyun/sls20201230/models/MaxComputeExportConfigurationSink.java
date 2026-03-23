// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfigurationSink extends TeaModel {
    /**
     * <p>计算投递时间分区时的最小时间粒度（单位：秒）</p>
     * <ul>
     * <li>1800（默认值）</li>
     * <li>3600</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("bufferInterval")
    public String bufferInterval;

    /**
     * <p>需要投递的字段</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("fields")
    public java.util.List<String> fields;

    /**
     * <p>是否过滤无效内容</p>
     * <ul>
     * <li>true（默认值）</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterInvalid")
    public Boolean filterInvalid;

    /**
     * <p>写数据ak id</p>
     * 
     * <strong>example:</strong>
     * <p>axxxxxxxxxxxb</p>
     */
    @NameInMap("odpsAccessKeyId")
    @Deprecated
    public String odpsAccessKeyId;

    /**
     * <p>写数据ak secret</p>
     * 
     * <strong>example:</strong>
     * <p>aaxxxxxxxxxxxxxxxxxxxxxbb</p>
     */
    @NameInMap("odpsAccessSecret")
    @Deprecated
    public String odpsAccessSecret;

    /**
     * <p>MaxCompute Endpoint</p>
     * <ul>
     * <li>⚠️注意：仅支持同地域的Endpoint</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://service.cn-hangzhou-intranet.maxcompute.aliyun-inc.com/api">https://service.cn-hangzhou-intranet.maxcompute.aliyun-inc.com/api</a></p>
     */
    @NameInMap("odpsEndpoint")
    public String odpsEndpoint;

    /**
     * <p>MaxCompute项目名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_project</p>
     */
    @NameInMap("odpsProject")
    public String odpsProject;

    /**
     * <p>写MaxCompute ram角色</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxxxxxx</p>
     */
    @NameInMap("odpsRolearn")
    public String odpsRolearn;

    /**
     * <p>MaxCompute表名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_table</p>
     */
    @NameInMap("odpsTable")
    public String odpsTable;

    /**
     * <p>MaxCompute Tunnel Endpoint</p>
     * <ul>
     * <li>⚠️注意：仅支持同地域的Tunnel Endpoint</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dt.cn-hangzhou-intranet.maxcompute.aliyun-inc.com">https://dt.cn-hangzhou-intranet.maxcompute.aliyun-inc.com</a></p>
     */
    @NameInMap("odpsTunnelEndpoint")
    public String odpsTunnelEndpoint;

    /**
     * <p>需要投递的分区字段</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("partitionColumn")
    public java.util.List<String> partitionColumn;

    /**
     * <p>时间分区格式</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>%Y_%m_%d</p>
     */
    @NameInMap("partitionTimeFormat")
    public String partitionTimeFormat;

    /**
     * <p>分区时间类型，支持如下两种：</p>
     * <ul>
     * <li>StrfTimeFormat（默认值）</li>
     * <li>JavaSimpleDateFormat</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StrfTimeFormat</p>
     */
    @NameInMap("timeFormatType")
    public String timeFormatType;

    /**
     * <p>时间分区</p>
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
