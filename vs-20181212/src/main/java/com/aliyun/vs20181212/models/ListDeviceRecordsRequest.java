// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceRecordsRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchCriteria")
    public String searchCriteria;

    @NameInMap("StreamId")
    public String streamId;

    public static ListDeviceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceRecordsRequest self = new ListDeviceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceRecordsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListDeviceRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDeviceRecordsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDeviceRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeviceRecordsRequest setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
        return this;
    }
    public String getSearchCriteria() {
        return this.searchCriteria;
    }

    public ListDeviceRecordsRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
