// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTasksummaryRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static QueryLinkeLinkaTasksummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTasksummaryRequest self = new QueryLinkeLinkaTasksummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTasksummaryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
