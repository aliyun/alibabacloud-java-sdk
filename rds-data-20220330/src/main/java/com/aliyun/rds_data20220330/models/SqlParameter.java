// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class SqlParameter extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TypeHint")
    public String typeHint;

    @NameInMap("Value")
    public Field value;

    public static SqlParameter build(java.util.Map<String, ?> map) throws Exception {
        SqlParameter self = new SqlParameter();
        return TeaModel.build(map, self);
    }

    public SqlParameter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SqlParameter setTypeHint(String typeHint) {
        this.typeHint = typeHint;
        return this;
    }
    public String getTypeHint() {
        return this.typeHint;
    }

    public SqlParameter setValue(Field value) {
        this.value = value;
        return this;
    }
    public Field getValue() {
        return this.value;
    }

}
