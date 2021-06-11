// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDataSourcesRequest extends TeaModel {
    @NameInMap("DataSourceIdList")
    public String dataSourceIdList;

    public static DeleteDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourcesRequest self = new DeleteDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourcesRequest setDataSourceIdList(String dataSourceIdList) {
        this.dataSourceIdList = dataSourceIdList;
        return this;
    }
    public String getDataSourceIdList() {
        return this.dataSourceIdList;
    }

}
