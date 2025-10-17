// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckDBNameZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDBNameZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameZonalResponseBody self = new CheckDBNameZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDBNameZonalResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CheckDBNameZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
