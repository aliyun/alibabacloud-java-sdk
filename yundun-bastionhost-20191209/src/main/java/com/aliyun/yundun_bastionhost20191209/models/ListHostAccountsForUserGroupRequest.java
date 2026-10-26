// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserGroupRequest extends TeaModel {
    /**
     * <p>The name of the host account to query. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the host for which you want to query the host accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain the parameter value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The instance ID of the Bastionhost instance to which the user group belongs. You can query the list of host accounts with authorization for this user group.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the parameter value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number for paging in a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for paging in a paged query.<br>Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned.</p>
     * <blockquote>
     * <p>Do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance that contains the user group for which you want to query the list of authorized host accounts.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group whose authorized host accounts you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to obtain the parameter value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListHostAccountsForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserGroupRequest self = new ListHostAccountsForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserGroupRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ListHostAccountsForUserGroupRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListHostAccountsForUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostAccountsForUserGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostAccountsForUserGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostAccountsForUserGroupRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListHostAccountsForUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostAccountsForUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
