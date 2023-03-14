// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserRequest extends TeaModel {
    /**
     * <p>The endpoint of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The name of the host that you want to query. Only exact match is supported.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Bastionhost instance where you want to query the hosts that the user is authorized or not authorized to manage.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The category of the host that you want to query. Valid values:</p>
     * <br>
     * <p>*   **Authorized**: Query the hosts that the user is authorized to manage. This is the default value.</p>
     * <p>*   **Unauthorized**: Query the hosts that the user is not authorized to manage.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The operating system of the host that you want to query. Valid values:</p>
     * <br>
     * <p>*   **Linux**</p>
     * <p>*   **Windows**</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>The value of the PageSize parameter must not exceed 100. Default value: 20. If you leave the PageSize parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave the PageSize parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance where you want to query the hosts that the user is authorized or not authorized to manage.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user ID.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListHostsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostsForUserRequest self = new ListHostsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListHostsForUserRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public ListHostsForUserRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListHostsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostsForUserRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListHostsForUserRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ListHostsForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostsForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostsForUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
