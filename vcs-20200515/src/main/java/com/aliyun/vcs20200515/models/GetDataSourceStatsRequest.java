// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDataSourceStatsRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    public static GetDataSourceStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceStatsRequest self = new GetDataSourceStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceStatsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public GetDataSourceStatsRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
