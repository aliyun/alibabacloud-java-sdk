// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmMetricRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Id")
    public String id;

    public static QueryRmsAlarmMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmMetricRequest self = new QueryRmsAlarmMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmMetricRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlarmMetricRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
