// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexRequest extends TeaModel {
    @NameInMap("dataSource")
    public String dataSource;

    public static GetIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexRequest self = new GetIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

}
