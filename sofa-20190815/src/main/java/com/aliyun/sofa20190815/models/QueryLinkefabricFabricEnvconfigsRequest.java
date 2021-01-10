// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricEnvconfigsRequest extends TeaModel {
    @NameInMap("CronExp")
    public String cronExp;

    public static QueryLinkefabricFabricEnvconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricEnvconfigsRequest self = new QueryLinkefabricFabricEnvconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricEnvconfigsRequest setCronExp(String cronExp) {
        this.cronExp = cronExp;
        return this;
    }
    public String getCronExp() {
        return this.cronExp;
    }

}
