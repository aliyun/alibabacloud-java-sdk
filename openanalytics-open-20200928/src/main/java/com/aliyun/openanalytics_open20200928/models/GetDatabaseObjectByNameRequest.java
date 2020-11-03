// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByNameRequest extends TeaModel {
    // 数据库名称
    @NameInMap("Name")
    public String name;

    public static GetDatabaseObjectByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByNameRequest self = new GetDatabaseObjectByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
