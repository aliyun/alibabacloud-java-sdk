// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateDatasourceResponseBody extends TeaModel {
    @NameInMap("DatasourceId")
    public String datasourceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceResponseBody self = new CreateDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceResponseBody setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public CreateDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
