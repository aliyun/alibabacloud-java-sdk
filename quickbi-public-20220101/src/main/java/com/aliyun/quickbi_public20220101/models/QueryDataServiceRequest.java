// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("ReturnFields")
    public String returnFields;

    public static QueryDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceRequest self = new QueryDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public QueryDataServiceRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public QueryDataServiceRequest setReturnFields(String returnFields) {
        this.returnFields = returnFields;
        return this;
    }
    public String getReturnFields() {
        return this.returnFields;
    }

}
