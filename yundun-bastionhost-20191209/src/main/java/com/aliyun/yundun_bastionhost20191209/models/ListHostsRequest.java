// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsRequest extends TeaModel {
    /**
     * <p>The endpoint of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The ID of the host group to which the host that you want to query belongs.</p>
     * <br>
     * <p>>  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The name of the host that you want to query. Only exact match is supported.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Bastionhost instance where you want to query hosts.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operating system of the host that you want to query. Valid values:</p>
     * <br>
     * <p>*   **Linux**</p>
     * <p>*   **Windows**</p>
     */
    @NameInMap("OSType")
    public String OSType;

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
     * <p>The region ID of the Bastionhost instance where you want to query hosts.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the host that you want to query. Valid values:</p>
     * <br>
     * <p>*   **Local**: an on-premises host</p>
     * <p>*   **Ecs**: an Elastic Compute Service (ECS) instance</p>
     * <p>*   **Rds**: a host in a dedicated cluster</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the ECS instance or dedicated cluster host that you want to query. Only exact match is supported.</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The status of the host that you want to query. Valid values:</p>
     * <br>
     * <p>- **Normal**: The host is normal.</p>
     * <br>
     * <p>- **Release**: The host is released.</p>
     */
    @NameInMap("SourceInstanceState")
    public String sourceInstanceState;

    public static ListHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostsRequest self = new ListHostsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostsRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public ListHostsRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ListHostsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListHostsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostsRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ListHostsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListHostsRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListHostsRequest setSourceInstanceState(String sourceInstanceState) {
        this.sourceInstanceState = sourceInstanceState;
        return this;
    }
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

}
