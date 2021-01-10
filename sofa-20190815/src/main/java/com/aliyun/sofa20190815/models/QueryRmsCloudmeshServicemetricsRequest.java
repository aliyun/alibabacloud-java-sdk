// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshServicemetricsRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("QueryJsonStr")
    public String queryJsonStr;

    public static QueryRmsCloudmeshServicemetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshServicemetricsRequest self = new QueryRmsCloudmeshServicemetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshServicemetricsRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsCloudmeshServicemetricsRequest setQueryJsonStr(String queryJsonStr) {
        this.queryJsonStr = queryJsonStr;
        return this;
    }
    public String getQueryJsonStr() {
        return this.queryJsonStr;
    }

}
