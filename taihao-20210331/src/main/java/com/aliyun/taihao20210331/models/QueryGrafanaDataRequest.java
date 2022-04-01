// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class QueryGrafanaDataRequest extends TeaModel {
    @NameInMap("getGrafanaDataParam")
    public QueryGrafanaDataParam getGrafanaDataParam;

    public static QueryGrafanaDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGrafanaDataRequest self = new QueryGrafanaDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryGrafanaDataRequest setGetGrafanaDataParam(QueryGrafanaDataParam getGrafanaDataParam) {
        this.getGrafanaDataParam = getGrafanaDataParam;
        return this;
    }
    public QueryGrafanaDataParam getGetGrafanaDataParam() {
        return this.getGrafanaDataParam;
    }

}
