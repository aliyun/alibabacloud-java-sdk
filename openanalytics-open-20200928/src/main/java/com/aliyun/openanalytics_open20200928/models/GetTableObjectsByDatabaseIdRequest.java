// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByDatabaseIdRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DBId")
    public Long DBId;

    public static GetTableObjectsByDatabaseIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByDatabaseIdRequest self = new GetTableObjectsByDatabaseIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByDatabaseIdRequest setDBId(Long DBId) {
        this.DBId = DBId;
        return this;
    }
    public Long getDBId() {
        return this.DBId;
    }

}
