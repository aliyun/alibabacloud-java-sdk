// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterDatabaseShrinkRequest extends TeaModel {
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
    public String parametersShrink;

    public static AlterDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseShrinkRequest self = new AlterDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlterDatabaseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlterDatabaseShrinkRequest setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public AlterDatabaseShrinkRequest setOldDbName(String oldDbName) {
        this.oldDbName = oldDbName;
        return this;
    }
    public String getOldDbName() {
        return this.oldDbName;
    }

    public AlterDatabaseShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
