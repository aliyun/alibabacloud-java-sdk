// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class WorkSaveAudienceRequest extends TeaModel {
    // 组织ID
    @NameInMap("AccessId")
    public String accessId;

    // 受众名称
    @NameInMap("AudienceName")
    public String audienceName;

    // 数据库链接串
    @NameInMap("ConnStr")
    public String connStr;

    // pgsql需要
    @NameInMap("DbSchema")
    public String dbSchema;

    // 数据源类型
    @NameInMap("DsType")
    public String dsType;

    // 加密方式
    @NameInMap("EncryType")
    public String encryType;

    // 导出字段
    @NameInMap("ExportField")
    public String exportField;

    // 实例名
    @NameInMap("Instance")
    public String instance;

    // ID类型
    @NameInMap("MappingType")
    public String mappingType;

    // sql语句
    @NameInMap("Statement")
    public String statement;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkSaveAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        WorkSaveAudienceRequest self = new WorkSaveAudienceRequest();
        return TeaModel.build(map, self);
    }

    public WorkSaveAudienceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public WorkSaveAudienceRequest setAudienceName(String audienceName) {
        this.audienceName = audienceName;
        return this;
    }
    public String getAudienceName() {
        return this.audienceName;
    }

    public WorkSaveAudienceRequest setConnStr(String connStr) {
        this.connStr = connStr;
        return this;
    }
    public String getConnStr() {
        return this.connStr;
    }

    public WorkSaveAudienceRequest setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
        return this;
    }
    public String getDbSchema() {
        return this.dbSchema;
    }

    public WorkSaveAudienceRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public WorkSaveAudienceRequest setEncryType(String encryType) {
        this.encryType = encryType;
        return this;
    }
    public String getEncryType() {
        return this.encryType;
    }

    public WorkSaveAudienceRequest setExportField(String exportField) {
        this.exportField = exportField;
        return this;
    }
    public String getExportField() {
        return this.exportField;
    }

    public WorkSaveAudienceRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public WorkSaveAudienceRequest setMappingType(String mappingType) {
        this.mappingType = mappingType;
        return this;
    }
    public String getMappingType() {
        return this.mappingType;
    }

    public WorkSaveAudienceRequest setStatement(String statement) {
        this.statement = statement;
        return this;
    }
    public String getStatement() {
        return this.statement;
    }

    public WorkSaveAudienceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WorkSaveAudienceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
