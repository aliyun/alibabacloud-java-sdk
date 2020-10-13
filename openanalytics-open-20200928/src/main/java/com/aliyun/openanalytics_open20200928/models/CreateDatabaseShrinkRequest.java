// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CreateDatabaseShrinkRequest extends TeaModel {
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
    public String parametersShrink;

    public static CreateDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseShrinkRequest self = new CreateDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatabaseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatabaseShrinkRequest setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public CreateDatabaseShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
