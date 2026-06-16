// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceRequest extends TeaModel {
    /**
     * <p>The node type. Valid values: polarx_cn, polarx_dn, polarx_cdc, polarx_gms, and polarx_columnar.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The name of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*******</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The node names. Separate multiple node names with commas (,). You can specify up to 10 CDC nodes and compute nodes, or up to 1 data node at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-i-<strong><strong><strong>,pxc-i-</strong></strong></strong>*</p>
     */
    @NameInMap("DBNodeIds")
    public String DBNodeIds;

    /**
     * <p>The node role. Valid values:</p>
     * <ul>
     * <li>master: primary node.</li>
     * <li>slave: secondary node. This value applies to DN and GMS nodes.</li>
     * <li>standby: secondary node. This value applies to CN nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("DBNodeRole")
    public String DBNodeRole;

    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-ddTHH:mmZ format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-18T15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric names. Separate multiple metric names with commas (,). You can specify up to 6 metrics. For more information, see <a href="https://help.aliyun.com/document_detail/332726.html">Performance metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cpu_Usage,Mem_Usage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-ddTHH:mmZ format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-08T15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBNodePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceRequest self = new DescribeDBNodePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodePerformanceRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeDBNodePerformanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBNodePerformanceRequest setDBNodeIds(String DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    public DescribeDBNodePerformanceRequest setDBNodeRole(String DBNodeRole) {
        this.DBNodeRole = DBNodeRole;
        return this;
    }
    public String getDBNodeRole() {
        return this.DBNodeRole;
    }

    public DescribeDBNodePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBNodePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBNodePerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBNodePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
