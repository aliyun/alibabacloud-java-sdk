// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByIdRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public String dbId;

    public static GetDatabaseObjectByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByIdRequest self = new GetDatabaseObjectByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByIdRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

}
