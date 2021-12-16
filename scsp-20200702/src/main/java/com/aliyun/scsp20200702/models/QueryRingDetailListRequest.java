// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryRingDetailListRequest extends TeaModel {
    @NameInMap("CallOutStatus")
    public String callOutStatus;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("FromPhoneNumList")
    public java.util.Map<String, ?> fromPhoneNumList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("ToPhoneNumList")
    public java.util.Map<String, ?> toPhoneNumList;

    public static QueryRingDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRingDetailListRequest self = new QueryRingDetailListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRingDetailListRequest setCallOutStatus(String callOutStatus) {
        this.callOutStatus = callOutStatus;
        return this;
    }
    public String getCallOutStatus() {
        return this.callOutStatus;
    }

    public QueryRingDetailListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryRingDetailListRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryRingDetailListRequest setFromPhoneNumList(java.util.Map<String, ?> fromPhoneNumList) {
        this.fromPhoneNumList = fromPhoneNumList;
        return this;
    }
    public java.util.Map<String, ?> getFromPhoneNumList() {
        return this.fromPhoneNumList;
    }

    public QueryRingDetailListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRingDetailListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRingDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRingDetailListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryRingDetailListRequest setToPhoneNumList(java.util.Map<String, ?> toPhoneNumList) {
        this.toPhoneNumList = toPhoneNumList;
        return this;
    }
    public java.util.Map<String, ?> getToPhoneNumList() {
        return this.toPhoneNumList;
    }

}
