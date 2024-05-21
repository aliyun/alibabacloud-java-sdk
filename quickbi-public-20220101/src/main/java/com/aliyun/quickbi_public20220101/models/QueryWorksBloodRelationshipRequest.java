// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipRequest extends TeaModel {
    /**
     * <p>Obtains the kinship of a data work, including the datasets referenced by each component and query field information. Currently, only supported data works include dashboards, workbooks, and self-service data retrieval.</p>
     * <br>
     * <p>This parameter is required.</p>
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
