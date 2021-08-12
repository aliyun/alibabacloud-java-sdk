// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeIpcsRequest extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentDeviceType")
    public String parentDeviceType;

    @NameInMap("DeviceIdList")
    public String deviceIdList;

    @NameInMap("NvrIdList")
    public String nvrIdList;

    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DeviceFilter")
    public String deviceFilter;

    public static DescribeIpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcsRequest self = new DescribeIpcsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpcsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeIpcsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeIpcsRequest setParentDeviceType(String parentDeviceType) {
        this.parentDeviceType = parentDeviceType;
        return this;
    }
    public String getParentDeviceType() {
        return this.parentDeviceType;
    }

    public DescribeIpcsRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    public DescribeIpcsRequest setNvrIdList(String nvrIdList) {
        this.nvrIdList = nvrIdList;
        return this;
    }
    public String getNvrIdList() {
        return this.nvrIdList;
    }

    public DescribeIpcsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeIpcsRequest setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

}
