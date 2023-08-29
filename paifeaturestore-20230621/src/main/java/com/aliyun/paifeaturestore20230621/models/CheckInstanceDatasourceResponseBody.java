// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckInstanceDatasourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CheckInstanceDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceDatasourceResponseBody self = new CheckInstanceDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckInstanceDatasourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
