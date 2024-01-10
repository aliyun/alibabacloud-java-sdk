// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectModifyRecordsShrinkRequest extends TeaModel {
    @NameInMap("Databases")
    public String databasesShrink;

    @NameInMap("Id")
    public String id;

    public static CreateProjectModifyRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectModifyRecordsShrinkRequest self = new CreateProjectModifyRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectModifyRecordsShrinkRequest setDatabasesShrink(String databasesShrink) {
        this.databasesShrink = databasesShrink;
        return this;
    }
    public String getDatabasesShrink() {
        return this.databasesShrink;
    }

    public CreateProjectModifyRecordsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
