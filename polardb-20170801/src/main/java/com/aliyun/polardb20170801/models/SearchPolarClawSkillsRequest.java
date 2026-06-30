// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchPolarClawSkillsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The search keyword. If this parameter is not specified, popular or recommended results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("Query")
    public String query;

    public static SearchPolarClawSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPolarClawSkillsRequest self = new SearchPolarClawSkillsRequest();
        return TeaModel.build(map, self);
    }

    public SearchPolarClawSkillsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SearchPolarClawSkillsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchPolarClawSkillsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
