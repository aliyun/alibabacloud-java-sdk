// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponseBody extends TeaModel {
    // 数据源Id
    @NameInMap("DataSourceId")
    public String dataSourceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponseBody self = new CreateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
