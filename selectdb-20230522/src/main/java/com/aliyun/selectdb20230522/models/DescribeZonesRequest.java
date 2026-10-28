// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <ul>
     * <li>If you do not specify the <strong>MaxResults</strong> request parameter, you do not need to query data in batches. The value of the <strong>MaxResults</strong> response parameter indicates the total number of list entries.</li>
     * <li>If you specify the <strong>MaxResults</strong> request parameter, you must query data in batches. The value of the <strong>MaxResults</strong> response parameter indicates the number of list entries in the current batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>40831b4f-d91d-4796-9589-ad306ec528d5</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeZonesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
