// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStatusRequest extends TeaModel {
    @NameInMap("WorksId")
    public String worksId;

    public static QueryEmbeddedStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedStatusRequest self = new QueryEmbeddedStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedStatusRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
