// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisTrafficRankingRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the traffic ranking analysis result. Set this parameter to the value returned by the StartNisTrafficRanking operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-6462a7b4c4a54b****</p>
     */
    @NameInMap("NisTrafficRankingId")
    public String nisTrafficRankingId;

    public static DescribeNisTrafficRankingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisTrafficRankingRequest self = new DescribeNisTrafficRankingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisTrafficRankingRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisTrafficRankingRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisTrafficRankingRequest setNisTrafficRankingId(String nisTrafficRankingId) {
        this.nisTrafficRankingId = nisTrafficRankingId;
        return this;
    }
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

}
