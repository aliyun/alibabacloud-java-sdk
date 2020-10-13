// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    // 创建数据库的名字
    @NameInMap("Name")
    public String name;

    // 数据库描述
    @NameInMap("Description")
    public String description;

    // 数据库的 location
    @NameInMap("LocationUri")
    public String locationUri;

    // 数据库属性
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatabaseRequest setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public CreateDatabaseRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

}
