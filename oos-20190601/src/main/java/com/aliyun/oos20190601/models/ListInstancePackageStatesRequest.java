// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePackageStatesRequest extends TeaModel {
    /**
     * <p>ECS instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cpoxxxwxxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctzxxxxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>List of extension names</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;template1&quot;,&quot;template2&quot;]</p>
     */
    @NameInMap("TemplateNames")
    public String templateNames;

    public static ListInstancePackageStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePackageStatesRequest self = new ListInstancePackageStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancePackageStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancePackageStatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePackageStatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePackageStatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstancePackageStatesRequest setTemplateNames(String templateNames) {
        this.templateNames = templateNames;
        return this;
    }
    public String getTemplateNames() {
        return this.templateNames;
    }

}
