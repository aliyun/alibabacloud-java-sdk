// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAllAppResourceGroupRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("Type")
    public String type;

    public static QueryRmsAllAppResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAllAppResourceGroupRequest self = new QueryRmsAllAppResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAllAppResourceGroupRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAllAppResourceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryRmsAllAppResourceGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
