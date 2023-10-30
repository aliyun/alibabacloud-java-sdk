// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the host for which the host accounts were queried.</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The total number of host accounts returned.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the user for which you want to query authorized host accounts.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user ID.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The name of the host account that you want to query. Exact match is supported.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the host account.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The region ID of the Bastionhost instance where you want to query the host accounts that the user is authorized to manage on the host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListHostAccountsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserRequest self = new ListHostAccountsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ListHostAccountsForUserRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListHostAccountsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostAccountsForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostAccountsForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostAccountsForUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostAccountsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
