// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipRequest extends TeaModel {
    /**
     * <p>The ID of the data work.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd****</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static QueryWorksBloodRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksBloodRelationshipRequest self = new QueryWorksBloodRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksBloodRelationshipRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
