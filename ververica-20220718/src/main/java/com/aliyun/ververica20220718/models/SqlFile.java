// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlFile extends TeaModel {
    @NameInMap("batchMode")
    public String batchMode;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("parentId")
    public String parentId;

    @NameInMap("sessionClusterName")
    public String sessionClusterName;

    @NameInMap("sqlFileId")
    public String sqlFileId;

    @NameInMap("sqlScript")
    public String sqlScript;

    @NameInMap("workspace")
    public String workspace;

    public static SqlFile build(java.util.Map<String, ?> map) throws Exception {
        SqlFile self = new SqlFile();
        return TeaModel.build(map, self);
    }

    public SqlFile setBatchMode(String batchMode) {
        this.batchMode = batchMode;
        return this;
    }
    public String getBatchMode() {
        return this.batchMode;
    }

    public SqlFile setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SqlFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SqlFile setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SqlFile setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public SqlFile setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    public SqlFile setSqlFileId(String sqlFileId) {
        this.sqlFileId = sqlFileId;
        return this;
    }
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    public SqlFile setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }
    public String getSqlScript() {
        return this.sqlScript;
    }

    public SqlFile setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
