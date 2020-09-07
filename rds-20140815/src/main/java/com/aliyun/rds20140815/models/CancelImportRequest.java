// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelImportRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ImportId")
    @Validation(required = true)
    public Integer importId;

    public static CancelImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelImportRequest self = new CancelImportRequest();
        return TeaModel.build(map, self);
    }

    public CancelImportRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CancelImportRequest setImportId(Integer importId) {
        this.importId = importId;
        return this;
    }
    public Integer getImportId() {
        return this.importId;
    }

}
