// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsRequest extends TeaModel {
    @NameInMap("HostAddress")
    public String hostAddress;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceInstanceState")
    public String sourceInstanceState;

    public static ListOperationHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostsRequest self = new ListOperationHostsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationHostsRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public ListOperationHostsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListOperationHostsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationHostsRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ListOperationHostsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationHostsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOperationHostsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListOperationHostsRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListOperationHostsRequest setSourceInstanceState(String sourceInstanceState) {
        this.sourceInstanceState = sourceInstanceState;
        return this;
    }
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

}
