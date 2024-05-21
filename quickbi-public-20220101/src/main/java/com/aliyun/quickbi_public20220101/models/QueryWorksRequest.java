// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static QueryWorksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksRequest self = new QueryWorksRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
