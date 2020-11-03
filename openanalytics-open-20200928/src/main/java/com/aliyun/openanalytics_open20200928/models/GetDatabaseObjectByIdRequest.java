// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByIdRequest extends TeaModel {
    // 数据库 ID
    @NameInMap("DBId")
    public String DBId;

    public static GetDatabaseObjectByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByIdRequest self = new GetDatabaseObjectByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByIdRequest setDBId(String DBId) {
        this.DBId = DBId;
        return this;
    }
    public String getDBId() {
        return this.DBId;
    }

}
