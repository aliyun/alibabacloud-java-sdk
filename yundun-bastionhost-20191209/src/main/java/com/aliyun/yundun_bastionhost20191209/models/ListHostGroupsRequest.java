// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsRequest extends TeaModel {
    /**
     * <p>The name of the host group that you want to query. Only exact match is supported.</p>
     */
    @NameInMap("HostGroupName")
    public String hostGroupName;

    /**
     * <p>The ID of the Bastionhost instance where you want to query host groups.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>The value of the PageSize parameter must not exceed 100. Default value: 20. If you leave the PageSize parameter empty, 20 entries are returned on each page by default.</p>
     * <br>
     * <p>>  We recommend that you do not leave the PageSize parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance where you want to query host groups.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListHostGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsRequest self = new ListHostGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsRequest setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public ListHostGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostGroupsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostGroupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
