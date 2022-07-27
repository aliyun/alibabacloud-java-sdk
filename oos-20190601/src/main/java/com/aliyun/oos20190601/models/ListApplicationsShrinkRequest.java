// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationsShrinkRequest extends TeaModel {
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
    public String tagsShrink;

    public static ListApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsShrinkRequest self = new ListApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListApplicationsShrinkRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public ListApplicationsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApplicationsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
