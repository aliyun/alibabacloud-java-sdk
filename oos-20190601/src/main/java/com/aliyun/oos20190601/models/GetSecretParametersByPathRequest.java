// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersByPathRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Path")
    public String path;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParametersByPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersByPathRequest self = new GetSecretParametersByPathRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersByPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParametersByPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetSecretParametersByPathRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public GetSecretParametersByPathRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetSecretParametersByPathRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetSecretParametersByPathRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
