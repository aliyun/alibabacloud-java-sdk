// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaMngtasksummaryRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static QueryLinkeLinkaMngtasksummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaMngtasksummaryRequest self = new QueryLinkeLinkaMngtasksummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaMngtasksummaryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
