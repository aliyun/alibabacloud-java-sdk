// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmHistorycountRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("From")
    public Long from;

    @NameInMap("To")
    public Long to;

    public static QueryRmsAlarmHistorycountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmHistorycountRequest self = new QueryRmsAlarmHistorycountRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmHistorycountRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlarmHistorycountRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryRmsAlarmHistorycountRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
