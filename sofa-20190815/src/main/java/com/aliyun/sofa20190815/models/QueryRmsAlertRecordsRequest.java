// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertRecordsRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("QueryJsonStr")
    public String queryJsonStr;

    public static QueryRmsAlertRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertRecordsRequest self = new QueryRmsAlertRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertRecordsRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlertRecordsRequest setQueryJsonStr(String queryJsonStr) {
        this.queryJsonStr = queryJsonStr;
        return this;
    }
    public String getQueryJsonStr() {
        return this.queryJsonStr;
    }

}
