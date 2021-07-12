// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceChannelsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNum")
    public Long pageNum;

    public static ListDeviceChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceChannelsRequest self = new ListDeviceChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceChannelsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDeviceChannelsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListDeviceChannelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeviceChannelsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
