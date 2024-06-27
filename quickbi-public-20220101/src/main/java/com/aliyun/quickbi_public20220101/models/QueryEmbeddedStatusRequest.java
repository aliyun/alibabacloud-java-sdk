// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStatusRequest extends TeaModel {
    /**
     * <p>The work ID of the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
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
