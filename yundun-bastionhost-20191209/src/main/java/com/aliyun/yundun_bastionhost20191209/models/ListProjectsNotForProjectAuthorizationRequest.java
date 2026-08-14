// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectsNotForProjectAuthorizationRequest extends TeaModel {
    /**
     * <p>The project authorization ID.</p>
     * <blockquote>
     * <p>You can call the ListProjectAuthorizations operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationId")
    public Long authorizationId;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the bastion host instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost_std_intl-sg-uq833e2dz02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The project name to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maximum number of projects to return per request. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token. Leave this parameter empty or do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to skip.</p>
     * <blockquote>
     * <p>This parameter takes effect only when NextToken is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    public static ListProjectsNotForProjectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsNotForProjectAuthorizationRequest self = new ListProjectsNotForProjectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsNotForProjectAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public ListProjectsNotForProjectAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListProjectsNotForProjectAuthorizationRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProjectsNotForProjectAuthorizationRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsNotForProjectAuthorizationRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsNotForProjectAuthorizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProjectsNotForProjectAuthorizationRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
