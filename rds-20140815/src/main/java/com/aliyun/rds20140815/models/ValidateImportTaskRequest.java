// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ValidateImportTaskRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-sdfljk123****</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The estimated instance size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EstimatedSize")
    public Integer estimatedSize;

    /**
     * <p>The address of the source MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.1</p>
     */
    @NameInMap("Host")
    public String host;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the source MySQL user, encoded in Base64.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UGFzc3dvcmQxMjMK</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port number of the source MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the source cloud instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-wz9ff3acy500io5wdf5s</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li>ECS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The port number for backup transmission.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("StreamPort")
    public Integer streamPort;

    /**
     * <p>The username of the source MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myadmin</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The path of the Xtrabackup tool on the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/bin/xtrabackup</p>
     */
    @NameInMap("XtrabackupPath")
    public String xtrabackupPath;

    public static ValidateImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateImportTaskRequest self = new ValidateImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public ValidateImportTaskRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ValidateImportTaskRequest setEstimatedSize(Integer estimatedSize) {
        this.estimatedSize = estimatedSize;
        return this;
    }
    public Integer getEstimatedSize() {
        return this.estimatedSize;
    }

    public ValidateImportTaskRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ValidateImportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ValidateImportTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ValidateImportTaskRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ValidateImportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidateImportTaskRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ValidateImportTaskRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public ValidateImportTaskRequest setStreamPort(Integer streamPort) {
        this.streamPort = streamPort;
        return this;
    }
    public Integer getStreamPort() {
        return this.streamPort;
    }

    public ValidateImportTaskRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public ValidateImportTaskRequest setXtrabackupPath(String xtrabackupPath) {
        this.xtrabackupPath = xtrabackupPath;
        return this;
    }
    public String getXtrabackupPath() {
        return this.xtrabackupPath;
    }

}
