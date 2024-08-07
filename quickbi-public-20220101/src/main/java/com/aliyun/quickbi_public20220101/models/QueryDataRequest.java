// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4cc43bc3***</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("Conditions")
    public String conditions;

    /**
     * <strong>example:</strong>
     * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
     */
    @NameInMap("ReturnFields")
    public String returnFields;

    /**
     * <strong>example:</strong>
     * <p>b5d8fd9348cc4327****afb604</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataRequest self = new QueryDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public QueryDataRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public QueryDataRequest setReturnFields(String returnFields) {
        this.returnFields = returnFields;
        return this;
    }
    public String getReturnFields() {
        return this.returnFields;
    }

    public QueryDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
