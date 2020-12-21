// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRChannelDeviceRequest extends TeaModel {
    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("IsPage")
    public String isPage;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListNVRChannelDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNVRChannelDeviceRequest self = new ListNVRChannelDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListNVRChannelDeviceRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public ListNVRChannelDeviceRequest setIsPage(String isPage) {
        this.isPage = isPage;
        return this;
    }
    public String getIsPage() {
        return this.isPage;
    }

    public ListNVRChannelDeviceRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListNVRChannelDeviceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
