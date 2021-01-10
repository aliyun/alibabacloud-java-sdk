// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmHistoryRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("QueryParasJsonStr")
    public String queryParasJsonStr;

    public static QueryRmsAlarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmHistoryRequest self = new QueryRmsAlarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmHistoryRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlarmHistoryRequest setQueryParasJsonStr(String queryParasJsonStr) {
        this.queryParasJsonStr = queryParasJsonStr;
        return this;
    }
    public String getQueryParasJsonStr() {
        return this.queryParasJsonStr;
    }

}
