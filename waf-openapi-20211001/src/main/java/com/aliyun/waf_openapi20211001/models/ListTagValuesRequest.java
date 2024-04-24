// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ListTagValuesRequest extends TeaModel {
    /**
     * <p>The tag key.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the resource. Set the value to ALIYUN::WAF::DEFENSERESOURCE.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesRequest self = new ListTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagValuesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListTagValuesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagValuesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
