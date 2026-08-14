// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListMembersNotForProjectRequest extends TeaModel {
    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-i7m2d7zrw11</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the member accounts to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>162****5213</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to query. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The request token. Leave this parameter empty or set it to an empty string for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The project ID.</p>
     * <blockquote>
     * <p>You can call the ListProjects operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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

    public static ListMembersNotForProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMembersNotForProjectRequest self = new ListMembersNotForProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListMembersNotForProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMembersNotForProjectRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMembersNotForProjectRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMembersNotForProjectRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMembersNotForProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListMembersNotForProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMembersNotForProjectRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
