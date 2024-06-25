// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateSqlInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceNameRequest self = new UpdateSqlInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
