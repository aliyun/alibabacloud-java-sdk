// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByNameRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static QueryRmsResourceGroupByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByNameRequest self = new QueryRmsResourceGroupByNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByNameRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsResourceGroupByNameRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryRmsResourceGroupByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryRmsResourceGroupByNameRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
