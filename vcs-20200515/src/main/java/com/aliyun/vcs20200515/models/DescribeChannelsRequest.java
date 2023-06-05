// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeChannelsRequest extends TeaModel {
    @NameInMap("DeviceFilter")
    public String deviceFilter;

    @NameInMap("DeviceStatus")
    public String deviceStatus;

    /**
     * <p>NVR ID</p>
     */
    @NameInMap("NvrId")
    public String nvrId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ShowUnConfig")
    public Long showUnConfig;

    public static DescribeChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelsRequest self = new DescribeChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelsRequest setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    public DescribeChannelsRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public DescribeChannelsRequest setNvrId(String nvrId) {
        this.nvrId = nvrId;
        return this;
    }
    public String getNvrId() {
        return this.nvrId;
    }

    public DescribeChannelsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeChannelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeChannelsRequest setShowUnConfig(Long showUnConfig) {
        this.showUnConfig = showUnConfig;
        return this;
    }
    public Long getShowUnConfig() {
        return this.showUnConfig;
    }

}
