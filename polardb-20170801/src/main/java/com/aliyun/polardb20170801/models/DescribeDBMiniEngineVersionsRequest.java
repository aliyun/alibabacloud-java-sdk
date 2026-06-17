// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsRequest extends TeaModel {
    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li><p><strong>X86</strong></p>
     * </li>
     * <li><p><strong>ARM</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The product series. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Cluster Edition (default)</p>
     * </li>
     * <li><p><strong>SENormal</strong>: Standard Edition</p>
     * </li>
     * </ul>
     * <p>For more information about product series, see <a href="https://help.aliyun.com/document_detail/183258.html">Product series</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The minor version of the database engine.</p>
     * <ul>
     * <li><p>If <code>DBVersion</code> is set to <strong>8.0</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>8.0.2</strong></p>
     * </li>
     * <li><p><strong>8.0.1</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If <code>DBVersion</code> is set to <strong>5.7</strong>, the valid value is <strong>5.7.28</strong>.</p>
     * </li>
     * <li><p>If <code>DBVersion</code> is set to <strong>5.6</strong>, the valid value is <strong>5.6.16</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0.1</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The database type. The only valid value is <strong>MySQL</strong>.</p>
     * <ul>
     * <li><strong>MySQL</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The major version of the database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>8.0</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

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
     * <p>The zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBMiniEngineVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBMiniEngineVersionsRequest self = new DescribeDBMiniEngineVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBMiniEngineVersionsRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeDBMiniEngineVersionsRequest setCreationCategory(String creationCategory) {
        this.creationCategory = creationCategory;
        return this;
    }
    public String getCreationCategory() {
        return this.creationCategory;
    }

    public DescribeDBMiniEngineVersionsRequest setDBMinorVersion(String DBMinorVersion) {
        this.DBMinorVersion = DBMinorVersion;
        return this;
    }
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    public DescribeDBMiniEngineVersionsRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBMiniEngineVersionsRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBMiniEngineVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBMiniEngineVersionsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
