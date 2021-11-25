// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeNvrsRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DeviceFilter")
    public String deviceFilter;

    @NameInMap("NvrDeviceIdList")
    public String nvrDeviceIdList;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeNvrsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNvrsRequest self = new DescribeNvrsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNvrsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeNvrsRequest setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    public DescribeNvrsRequest setNvrDeviceIdList(String nvrDeviceIdList) {
        this.nvrDeviceIdList = nvrDeviceIdList;
        return this;
    }
    public String getNvrDeviceIdList() {
        return this.nvrDeviceIdList;
    }

    public DescribeNvrsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeNvrsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
