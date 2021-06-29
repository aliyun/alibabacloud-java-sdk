// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeNvrDevicesRequest extends TeaModel {
    @NameInMap("NvrDeviceIdList")
    public String nvrDeviceIdList;

    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DeviceFilter")
    public String deviceFilter;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeNvrDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNvrDevicesRequest self = new DescribeNvrDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNvrDevicesRequest setNvrDeviceIdList(String nvrDeviceIdList) {
        this.nvrDeviceIdList = nvrDeviceIdList;
        return this;
    }
    public String getNvrDeviceIdList() {
        return this.nvrDeviceIdList;
    }

    public DescribeNvrDevicesRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeNvrDevicesRequest setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    public DescribeNvrDevicesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeNvrDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
