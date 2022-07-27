// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersByPathRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Path")
    public String path;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("RegionId")
    public String regionId;

    public static GetParametersByPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParametersByPathRequest self = new GetParametersByPathRequest();
        return TeaModel.build(map, self);
    }

    public GetParametersByPathRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetParametersByPathRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetParametersByPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetParametersByPathRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public GetParametersByPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
