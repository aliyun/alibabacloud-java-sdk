// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ListTagValuesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The tag key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoKey</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the resource. Set the value to ALIYUN::WAF::DEFENSERESOURCE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::WAF::DEFENSERESOURCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesRequest self = new ListTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public ListTagValuesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ListTagValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
