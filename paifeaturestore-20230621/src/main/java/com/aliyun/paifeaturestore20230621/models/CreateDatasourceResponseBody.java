// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateDatasourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <strong>example:</strong>
     * <p>1C5B1511-8A5B-59C3-90AF-513F9210E882</p>
     */
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
