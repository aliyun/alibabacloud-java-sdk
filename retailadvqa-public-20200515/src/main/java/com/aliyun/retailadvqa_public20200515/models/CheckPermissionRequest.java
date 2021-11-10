// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckPermissionRequest extends TeaModel {
    // 组织ID
    @NameInMap("AccessId")
    public String accessId;

    // 数据库连接串
    @NameInMap("ConnStr")
    public String connStr;

    // pgsql需要
    @NameInMap("DbSchema")
    public String dbSchema;

    // 数据源类型
    @NameInMap("DsType")
    public String dsType;

    // 导出字段
    @NameInMap("ExportField")
    public String exportField;

    // 实例名
    @NameInMap("Instance")
    public String instance;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CheckPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPermissionRequest self = new CheckPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CheckPermissionRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CheckPermissionRequest setConnStr(String connStr) {
        this.connStr = connStr;
        return this;
    }
    public String getConnStr() {
        return this.connStr;
    }

    public CheckPermissionRequest setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
        return this;
    }
    public String getDbSchema() {
        return this.dbSchema;
    }

    public CheckPermissionRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public CheckPermissionRequest setExportField(String exportField) {
        this.exportField = exportField;
        return this;
    }
    public String getExportField() {
        return this.exportField;
    }

    public CheckPermissionRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public CheckPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckPermissionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
