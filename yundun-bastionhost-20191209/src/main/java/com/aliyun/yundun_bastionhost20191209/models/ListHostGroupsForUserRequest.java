// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HostGroupName")
    public String hostGroupName;

    /**
     * <p>The host groups returned.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>The value of the PageSize parameter must not exceed 100. Default value: 20. If you leave the PageSize parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave the PageSize parameter empty.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ID of the host group.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The ID of the user.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Bastionhost instance where you want to query the host groups that the user is authorized or not authorized to manage.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListHostGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserRequest self = new ListHostGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserRequest setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public ListHostGroupsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostGroupsForUserRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListHostGroupsForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostGroupsForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostGroupsForUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostGroupsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
