// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParameterVersionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static ListSecretParameterVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParameterVersionsRequest self = new ListSecretParameterVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretParameterVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSecretParameterVersionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSecretParameterVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecretParameterVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecretParameterVersionsRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListSecretParameterVersionsRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
