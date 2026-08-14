// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserGroupsForUserRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-m413tuhlo03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the user group to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number for a paged query. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries per page for a paged query.<br>The maximum value of PageSize is 100. The default number of entries per page is 20. If PageSize is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Specifies whether to disable paging. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Disables paging and returns all data.</p>
     * </li>
     * <li><p><strong>false</strong>: Enables paging and returns the number of user groups specified by PageSize.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PagingOff")
    public String pagingOff;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListUserGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForUserRequest self = new ListUserGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserGroupsForUserRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUserGroupsForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListUserGroupsForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUserGroupsForUserRequest setPagingOff(String pagingOff) {
        this.pagingOff = pagingOff;
        return this;
    }
    public String getPagingOff() {
        return this.pagingOff;
    }

    public ListUserGroupsForUserRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListUserGroupsForUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserGroupsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
