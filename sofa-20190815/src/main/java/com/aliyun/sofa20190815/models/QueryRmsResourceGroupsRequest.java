// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupsRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("PageQueryJsonStr")
    public String pageQueryJsonStr;

    @NameInMap("Type")
    public String type;

    public static QueryRmsResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupsRequest self = new QueryRmsResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupsRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsResourceGroupsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryRmsResourceGroupsRequest setPageQueryJsonStr(String pageQueryJsonStr) {
        this.pageQueryJsonStr = pageQueryJsonStr;
        return this;
    }
    public String getPageQueryJsonStr() {
        return this.pageQueryJsonStr;
    }

    public QueryRmsResourceGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
