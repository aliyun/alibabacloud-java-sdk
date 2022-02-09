// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsSyncDatabaseInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOmsSyncDatabaseInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsSyncDatabaseInfosResponseBody self = new UpdateOmsSyncDatabaseInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOmsSyncDatabaseInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
