// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("Names")
    public String names;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListApplicationsRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public ListApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApplicationsRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

}
