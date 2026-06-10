// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppCommoditySpecificationsV2ForPartnerRequest extends TeaModel {
    /**
     * <p>Number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token indicating the start of the next query. It is empty if there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAppCommoditySpecificationsV2ForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppCommoditySpecificationsV2ForPartnerRequest self = new ListAppCommoditySpecificationsV2ForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public ListAppCommoditySpecificationsV2ForPartnerRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppCommoditySpecificationsV2ForPartnerRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
