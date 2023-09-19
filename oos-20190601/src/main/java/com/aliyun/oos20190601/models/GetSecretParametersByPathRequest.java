// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersByPathRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 10. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The path of the encryption parameter. The path must be 1 to 200 characters in length. For example, if the name of an encryption parameter is /secretParameter/mySecretParameter, the path of the encryption parameter is /secretParameter.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether to recursively query encryption parameters from all levels of directories in the specified path. Valid values: true and false. For example, if you want to query the /secretParameter/mySecretParameter and /secretParameter/secretParameter 1/mySecretParameter parameters, the valid values specify the parameters to be returned.</p>
     * <br>
     * <p>*   true: returns both of the /secretParameter/mySecretParameter and /secretParameter/secretParameter1/mySecretParameter parameters.</p>
     * <p>*   false: returns only the /secretParameter/mySecretParameter parameter.</p>
     */
    @NameInMap("Recursive")
    public Boolean recursive;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to decrypt the parameter value. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParametersByPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersByPathRequest self = new GetSecretParametersByPathRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersByPathRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetSecretParametersByPathRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public GetSecretParametersByPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParametersByPathRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
