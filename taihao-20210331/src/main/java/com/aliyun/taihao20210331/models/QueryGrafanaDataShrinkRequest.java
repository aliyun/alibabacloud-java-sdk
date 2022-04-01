// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class QueryGrafanaDataShrinkRequest extends TeaModel {
    @NameInMap("getGrafanaDataParam")
    public String getGrafanaDataParamShrink;

    public static QueryGrafanaDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGrafanaDataShrinkRequest self = new QueryGrafanaDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryGrafanaDataShrinkRequest setGetGrafanaDataParamShrink(String getGrafanaDataParamShrink) {
        this.getGrafanaDataParamShrink = getGrafanaDataParamShrink;
        return this;
    }
    public String getGetGrafanaDataParamShrink() {
        return this.getGrafanaDataParamShrink;
    }

}
