// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterDatabaseRequest extends TeaModel {
    // 修改数据库的新名称
    @NameInMap("Name")
    public String name;

    // 数据库描述
    @NameInMap("Description")
    public String description;

    // 数据库的
    @NameInMap("LocationUri")
    public String locationUri;

    // 修改数据库的旧名称
    @NameInMap("OldDbName")
    public String oldDbName;

    // 数据库的
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    public static AlterDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseRequest self = new AlterDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlterDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlterDatabaseRequest setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public AlterDatabaseRequest setOldDbName(String oldDbName) {
        this.oldDbName = oldDbName;
        return this;
    }
    public String getOldDbName() {
        return this.oldDbName;
    }

    public AlterDatabaseRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

}
