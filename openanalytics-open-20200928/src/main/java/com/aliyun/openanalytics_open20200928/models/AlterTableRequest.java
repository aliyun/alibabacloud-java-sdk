// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterTableRequest extends TeaModel {
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
    public java.util.Map<String, String> parameters;

    // 表的列信息
    @NameInMap("Col")
    public java.util.List<AlterTableRequestCol> col;

    public static AlterTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterTableRequest self = new AlterTableRequest();
        return TeaModel.build(map, self);
    }

    public AlterTableRequest setOldDbName(String oldDbName) {
        this.oldDbName = oldDbName;
        return this;
    }
    public String getOldDbName() {
        return this.oldDbName;
    }

    public AlterTableRequest setOldTableName(String oldTableName) {
        this.oldTableName = oldTableName;
        return this;
    }
    public String getOldTableName() {
        return this.oldTableName;
    }

    public AlterTableRequest setNewDbName(String newDbName) {
        this.newDbName = newDbName;
        return this;
    }
    public String getNewDbName() {
        return this.newDbName;
    }

    public AlterTableRequest setNewTableName(String newTableName) {
        this.newTableName = newTableName;
        return this;
    }
    public String getNewTableName() {
        return this.newTableName;
    }

    public AlterTableRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public AlterTableRequest setCol(java.util.List<AlterTableRequestCol> col) {
        this.col = col;
        return this;
    }
    public java.util.List<AlterTableRequestCol> getCol() {
        return this.col;
    }

    public static class AlterTableRequestCol extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名称
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static AlterTableRequestCol build(java.util.Map<String, ?> map) throws Exception {
            AlterTableRequestCol self = new AlterTableRequestCol();
            return TeaModel.build(map, self);
        }

        public AlterTableRequestCol setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public AlterTableRequestCol setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AlterTableRequestCol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
