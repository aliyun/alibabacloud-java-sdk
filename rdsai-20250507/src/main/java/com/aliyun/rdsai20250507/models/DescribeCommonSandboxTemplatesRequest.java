// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeCommonSandboxTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYz/NvD85HpgBeRBCusEIeVQ0dHZH9jr+NP3X9Jx0iSoql55b9nd4PIDm252/a0f+U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCommonSandboxTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonSandboxTemplatesRequest self = new DescribeCommonSandboxTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonSandboxTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCommonSandboxTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCommonSandboxTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
