// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcivalidatecronRequest extends TeaModel {
    @NameInMap("Cron")
    public String cron;

    public static QueryLinkeBahamutAppcustomcivalidatecronRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcivalidatecronRequest self = new QueryLinkeBahamutAppcustomcivalidatecronRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcivalidatecronRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

}
