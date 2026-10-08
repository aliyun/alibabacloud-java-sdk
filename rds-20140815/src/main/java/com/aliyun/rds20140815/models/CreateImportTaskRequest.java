// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateImportTaskRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1u*****ggm7j9j</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The estimated data space. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("EstimatedSize")
    public Integer estimatedSize;

    /**
     * <p>The host IP address of the source MySQL instance. ApsaraDB RDS accesses this IP address to obtain the backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.246.90</p>
     */
    @NameInMap("Host")
    public String host;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the source MySQL account. The password must be Base64-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OEF5JjVOM2pzZXFKRw==</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port of the source MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the source cloud instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1fe296n52ub3chezpg</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The type of the source cloud instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The streaming port used to transfer the backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("StreamPort")
    public Integer streamPort;

    /**
     * <p>The account of the source MySQL instance. The account must have permissions to create backups and set up replication. Refer to the following SQL statements for granting permissions:</p>
     * <pre><code>-- MySQL 5.7
     * mysql&gt; CREATE USER \\&quot;myadmin\\&quot;@\\&quot;%\\&quot; IDENTIFIED BY \\&quot;s3cret\\&quot;;
     * mysql&gt; GRANT RELOAD, LOCK TABLES, PROCESS, REPLICATION CLIENT, REPLICATION SLAVE ON *.* TO
     *        \\&quot;myadmin\\&quot;@\\&quot;%\\&quot;;
     * mysql&gt; FLUSH PRIVILEGES;
     * -- MySQL 8.0
     * mysql&gt; CREATE USER \\&quot;myadmin\\&quot;@\\&quot;%\\&quot; IDENTIFIED BY \\&quot;Test123!\\&quot;;
     * mysql&gt; GRANT BACKUP_ADMIN, PROCESS, RELOAD, LOCK TABLES, REPLICATION CLIENT, REPLICATION SLAVE ON *.* TO \\&quot;myadmin\\&quot;@\\&quot;%\\&quot;;
     * mysql&gt; GRANT SELECT ON performance_schema.log_status TO \\&quot;myadmin\\&quot;@\\&quot;%\\&quot;;
     * mysql&gt; GRANT SELECT ON performance_schema.keyring_component_status TO myadmin@\\&quot;%\\&quot;;
     * mysql&gt; GRANT SELECT ON performance_schema.replication_group_members TO myadmin@\\&quot;%\\&quot;;
     * mysql&gt; FLUSH PRIVILEGES;
     * 
     * This parameter is required.
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>myadmin</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The installation path of xtrabackup on the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/bin/xtrabackup</p>
     */
    @NameInMap("XtrabackupPath")
    public String xtrabackupPath;

    public static CreateImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportTaskRequest self = new CreateImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImportTaskRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateImportTaskRequest setEstimatedSize(Integer estimatedSize) {
        this.estimatedSize = estimatedSize;
        return this;
    }
    public Integer getEstimatedSize() {
        return this.estimatedSize;
    }

    public CreateImportTaskRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateImportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImportTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateImportTaskRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateImportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImportTaskRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateImportTaskRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public CreateImportTaskRequest setStreamPort(Integer streamPort) {
        this.streamPort = streamPort;
        return this;
    }
    public Integer getStreamPort() {
        return this.streamPort;
    }

    public CreateImportTaskRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public CreateImportTaskRequest setXtrabackupPath(String xtrabackupPath) {
        this.xtrabackupPath = xtrabackupPath;
        return this;
    }
    public String getXtrabackupPath() {
        return this.xtrabackupPath;
    }

}
