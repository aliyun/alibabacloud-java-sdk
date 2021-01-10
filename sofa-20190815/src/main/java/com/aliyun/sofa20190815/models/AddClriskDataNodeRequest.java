// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddClriskDataNodeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Project")
    public String project;

    @NameInMap("TableName")
    public String tableName;

    public static AddClriskDataNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClriskDataNodeRequest self = new AddClriskDataNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddClriskDataNodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddClriskDataNodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddClriskDataNodeRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public AddClriskDataNodeRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
