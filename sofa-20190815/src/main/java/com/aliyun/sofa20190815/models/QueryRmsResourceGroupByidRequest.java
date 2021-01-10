// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByidRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Id")
    public String id;

    public static QueryRmsResourceGroupByidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByidRequest self = new QueryRmsResourceGroupByidRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByidRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsResourceGroupByidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
