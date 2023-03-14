// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The display name of the user to be queried. Only exact match is supported.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the Bastionhost instance to which the users to be queried belong.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mobile number of the user to be queried. Only exact match is supported.</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>The value of the PageSize parameter must not exceed 100. By default, the number of entries on each page is 20. If you do not set the PageSize parameter, 20 entries are returned per page by default.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance to which the users to be queried belong.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the user to be queried. Valid values:</p>
     * <br>
     * <p>*   **Local**: a local user</p>
     * <p>*   **Ram**: a RAM user</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique ID of the user to be queried. Only exact match is supported.</p>
     * <br>
     * <p>>  This parameter uniquely identifies a RAM user of the Bastionhost instance. This parameter takes effect only when the **Source** parameter is set to **Ram**. You can call the [ListUsers](~~28684~~) operation to obtain the unique ID of the user from the **UserId** response parameter.</p>
     */
    @NameInMap("SourceUserId")
    public String sourceUserId;

    /**
     * <p>The ID of the user group to be queried.</p>
     * <br>
     * <p>>  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The logon name of the user to be queried. Only exact match is supported.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The status of the user to be queried. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The user can access the Bastionhost instance.</p>
     * <p>*   **Frozen**: The user is locked and cannot access the Bastionhost instance.</p>
     * <p>*   **Expired**: The user has expired and cannot access the Bastionhost instance.</p>
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
