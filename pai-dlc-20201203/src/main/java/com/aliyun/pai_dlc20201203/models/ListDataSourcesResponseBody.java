// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    // 数据源配置列表
    @NameInMap("DataSources")
    public java.util.List<DataSourceItem> dataSources;

    // 符合条件的数据源总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setDataSources(java.util.List<DataSourceItem> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSourceItem> getDataSources() {
        return this.dataSources;
    }

    public ListDataSourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
