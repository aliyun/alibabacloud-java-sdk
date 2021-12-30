// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserRequest extends TeaModel {
    @NameInMap("HostAddress")
    public String hostAddress;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

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
