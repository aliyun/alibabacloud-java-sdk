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
     * <p>Specifies whether to perform an exact search by matching the slug.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exact")
    public Boolean exact;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The search keyword. If this parameter is not specified, popular or recommended skills are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The source of the skill. Valid values: clawhub and polarhub.</p>
     * 
     * <strong>example:</strong>
     * <p>polarhub</p>
     */
    @NameInMap("Source")
    public String source;

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

    public SearchPolarClawSkillsRequest setExact(Boolean exact) {
        this.exact = exact;
        return this;
    }
    public Boolean getExact() {
        return this.exact;
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

    public SearchPolarClawSkillsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
