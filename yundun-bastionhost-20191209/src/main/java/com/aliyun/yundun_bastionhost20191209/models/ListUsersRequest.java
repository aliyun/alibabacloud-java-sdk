// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceUserId")
    public String sourceUserId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("UserName")
    public String userName;

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
