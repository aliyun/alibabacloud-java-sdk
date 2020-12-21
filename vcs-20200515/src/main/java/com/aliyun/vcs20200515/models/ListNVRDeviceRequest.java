// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRDeviceRequest extends TeaModel {
    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("IsPage")
    public Long isPage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListNVRDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNVRDeviceRequest self = new ListNVRDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListNVRDeviceRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public ListNVRDeviceRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public ListNVRDeviceRequest setIsPage(Long isPage) {
        this.isPage = isPage;
        return this;
    }
    public Long getIsPage() {
        return this.isPage;
    }

    public ListNVRDeviceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListNVRDeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
