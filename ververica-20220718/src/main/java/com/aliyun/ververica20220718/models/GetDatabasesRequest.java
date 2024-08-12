// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDatabasesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>paimon-ods</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    public static GetDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabasesRequest self = new GetDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabasesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

}
