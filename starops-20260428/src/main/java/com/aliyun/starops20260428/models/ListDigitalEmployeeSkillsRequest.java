// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in a subsequent request to retrieve the next page of results. To retrieve the first page, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>sjC5rekx93Ew7K7VcmI3wkBZBYQ-GphB2ilQu3zJCGxoZuicwyJznfo2riTjr-lq</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static ListDigitalEmployeeSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillsRequest self = new ListDigitalEmployeeSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeeSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeeSkillsRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
