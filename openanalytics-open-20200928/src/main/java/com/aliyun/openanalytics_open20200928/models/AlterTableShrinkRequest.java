// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterTableShrinkRequest extends TeaModel {
    // 旧数据库名称
    @NameInMap("OldDbName")
    public String oldDbName;

    // 旧表名
    @NameInMap("OldTableName")
    public String oldTableName;

    // 新的数据库名
    @NameInMap("NewDbName")
    public String newDbName;

    // 新表名
    @NameInMap("NewTableName")
    public String newTableName;

    // 表的新参数
    @NameInMap("Parameters")
    public String parametersShrink;

    // 表的列信息
    @NameInMap("Col")
    public String colShrink;

    public static AlterTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterTableShrinkRequest self = new AlterTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AlterTableShrinkRequest setOldDbName(String oldDbName) {
        this.oldDbName = oldDbName;
        return this;
    }
    public String getOldDbName() {
        return this.oldDbName;
    }

    public AlterTableShrinkRequest setOldTableName(String oldTableName) {
        this.oldTableName = oldTableName;
        return this;
    }
    public String getOldTableName() {
        return this.oldTableName;
    }

    public AlterTableShrinkRequest setNewDbName(String newDbName) {
        this.newDbName = newDbName;
        return this;
    }
    public String getNewDbName() {
        return this.newDbName;
    }

    public AlterTableShrinkRequest setNewTableName(String newTableName) {
        this.newTableName = newTableName;
        return this;
    }
    public String getNewTableName() {
        return this.newTableName;
    }

    public AlterTableShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public AlterTableShrinkRequest setColShrink(String colShrink) {
        this.colShrink = colShrink;
        return this;
    }
    public String getColShrink() {
        return this.colShrink;
    }

}
