// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupErrorsRequest extends TeaModel {
    @NameInMap("appId")
    public String appId;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("startTime")
    public Integer startTime;

    @NameInMap("stopTime")
    public Integer stopTime;

    public static ListAppGroupErrorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupErrorsRequest self = new ListAppGroupErrorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupErrorsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppGroupErrorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupErrorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupErrorsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ListAppGroupErrorsRequest setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Integer getStopTime() {
        return this.stopTime;
    }

}
