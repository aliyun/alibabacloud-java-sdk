// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabasesProjectRequest extends TeaModel {
    /**
     * <p>The IDs of the database instances that you want to move. This parameter is a JSON-formatted string. You can specify up to 100 database instance IDs. Separate multiple database instance IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758822.html">ListDatabases</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2,3</p>
     */
    @NameInMap("DatabaseIds")
    public String databaseIds;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zmb2y9ydw08</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the project to which the database instances currently belong.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the target project to which you want to move the database instances.</p>
     * <blockquote>
     * <p>You can call the ListProjectsForProjectAuthorizationPrincipal operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    public static ModifyDatabasesProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabasesProjectRequest self = new ModifyDatabasesProjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabasesProjectRequest setDatabaseIds(String databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public String getDatabaseIds() {
        return this.databaseIds;
    }

    public ModifyDatabasesProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabasesProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyDatabasesProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDatabasesProjectRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

}
