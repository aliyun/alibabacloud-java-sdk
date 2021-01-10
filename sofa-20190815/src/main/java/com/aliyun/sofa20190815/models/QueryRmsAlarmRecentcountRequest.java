// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmRecentcountRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("NotUse")
    public String notUse;

    public static QueryRmsAlarmRecentcountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmRecentcountRequest self = new QueryRmsAlarmRecentcountRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmRecentcountRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlarmRecentcountRequest setNotUse(String notUse) {
        this.notUse = notUse;
        return this;
    }
    public String getNotUse() {
        return this.notUse;
    }

}
