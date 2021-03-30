// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStausRequest extends TeaModel {
    @NameInMap("WorksId")
    public String worksId;

    public static QueryEmbeddedStausRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedStausRequest self = new QueryEmbeddedStausRequest();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedStausRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
