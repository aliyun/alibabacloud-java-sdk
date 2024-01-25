// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionListRequest extends TeaModel {
    @NameInMap("EndTimeStamp")
    public String endTimeStamp;

    @NameInMap("InputStatus")
    public String inputStatus;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTimeStamp")
    public String startTimeStamp;

    @NameInMap("UniqueId")
    public String uniqueId;

    public static DescribeNewPlayVideoPlaySessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionListRequest self = new DescribeNewPlayVideoPlaySessionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionListRequest setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public String getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setInputStatus(String inputStatus) {
        this.inputStatus = inputStatus;
        return this;
    }
    public String getInputStatus() {
        return this.inputStatus;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public String getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public DescribeNewPlayVideoPlaySessionListRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
