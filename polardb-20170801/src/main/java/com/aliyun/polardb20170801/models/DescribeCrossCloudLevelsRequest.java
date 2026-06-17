// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudLevelsRequest extends TeaModel {
    /**
     * <p>The database engine type. Valid values:</p>
     * <ul>
     * <li><p>MySQL</p>
     * </li>
     * <li><p>PostgreSQL</p>
     * </li>
     * <li><p>Oracle</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version number of the database engine.</p>
     * <p>Valid values for MySQL:</p>
     * <ul>
     * <li><p>5.6</p>
     * </li>
     * <li><p>5.7</p>
     * </li>
     * <li><p>8.0</p>
     * </li>
     * </ul>
     * <p>Valid values for PostgreSQL:</p>
     * <ul>
     * <li><p>11</p>
     * </li>
     * <li><p>14</p>
     * </li>
     * <li><p>15</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The resource pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pj-87681rbcef6******</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The storage class.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SharedStorage</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeCrossCloudLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudLevelsRequest self = new DescribeCrossCloudLevelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudLevelsRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeCrossCloudLevelsRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeCrossCloudLevelsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeCrossCloudLevelsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
