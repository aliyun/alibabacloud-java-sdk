// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The display name of the user that you want to query. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The instance ID of the bastion host for which you want to query the user list.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mobile phone number of the user that you want to query. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1359999****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The page number of the current page in a paging query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries per page in a paging query.<br>The maximum value of the PageSize parameter is 100. The default number of entries per page is 20. If PageSize is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the bastion host for which you want to query the user list.</p>
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
     * <p>The source of the user that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Local</strong>: local user</li>
     * <li><strong>Ram</strong>: Resource Access Management (RAM) user</li>
     * <li><strong>AD</strong>: AD user</li>
     * <li><strong>LDAP</strong>: LDAP user</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique identity of the user that you want to query. Only exact match is supported.</p>
     * <blockquote>
     * <p>This parameter is the unique identity of the Resource Access Management (RAM) user that corresponds to the bastion host user. This parameter takes effect when the source of the newly created user is a RAM user (that is, <strong>Source</strong> is set to <strong>Ram</strong>). You can invoke the <a href="https://help.aliyun.com/document_detail/28684.html">ListUsers</a> operation of access control and obtain this parameter from the <strong>UserId</strong> field in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>122748924538****</p>
     */
    @NameInMap("SourceUserId")
    public String sourceUserId;

    /**
     * <p>The ID of the user group that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The logon name of the user that you want to query. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The status of the user that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: normal</li>
     * <li><strong>Frozen</strong>: locked</li>
     * <li><strong>Expired</strong>: expired</li>
     * <li><strong>RemoteDeleted</strong>: user source deleted</li>
     * <li><strong>Inactive</strong>: inactive due to prolonged absence of logon</li>
     * <li><strong>PasswordExpired</strong>: password expired</li>
     * <li><strong>RemoteDNChanged</strong>: user DN updated</li>
     * <li><strong>RemoteFrozen</strong>: frozen on the RAM side</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("UserState")
    public String userState;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ListUsersRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUsersRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListUsersRequest setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public ListUsersRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public ListUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ListUsersRequest setUserState(String userState) {
        this.userState = userState;
        return this;
    }
    public String getUserState() {
        return this.userState;
    }

}
