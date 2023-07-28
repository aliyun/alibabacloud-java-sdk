// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParameterVersionsRequest extends TeaModel {
    /**
     * <p>The share type of the common parameter.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The data type of the common parameter.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The pagination token.</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    public static ListParameterVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsRequest self = new ListParameterVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListParameterVersionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListParameterVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParameterVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListParameterVersionsRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

}
