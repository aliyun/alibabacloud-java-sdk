// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRulesGroupsRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("ResType")
    public String resType;

    public static QueryRmsRulesGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRulesGroupsRequest self = new QueryRmsRulesGroupsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsRulesGroupsRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsRulesGroupsRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

}
