// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryRingDetailListShrinkRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("CallOutStatus")
    public String callOutStatus;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("FromPhoneNumList")
    public String fromPhoneNumListShrink;

    @NameInMap("ToPhoneNumList")
    public String toPhoneNumListShrink;

    public static QueryRingDetailListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRingDetailListShrinkRequest self = new QueryRingDetailListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryRingDetailListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRingDetailListShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRingDetailListShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryRingDetailListShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryRingDetailListShrinkRequest setCallOutStatus(String callOutStatus) {
        this.callOutStatus = callOutStatus;
        return this;
    }
    public String getCallOutStatus() {
        return this.callOutStatus;
    }

    public QueryRingDetailListShrinkRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryRingDetailListShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRingDetailListShrinkRequest setFromPhoneNumListShrink(String fromPhoneNumListShrink) {
        this.fromPhoneNumListShrink = fromPhoneNumListShrink;
        return this;
    }
    public String getFromPhoneNumListShrink() {
        return this.fromPhoneNumListShrink;
    }

    public QueryRingDetailListShrinkRequest setToPhoneNumListShrink(String toPhoneNumListShrink) {
        this.toPhoneNumListShrink = toPhoneNumListShrink;
        return this;
    }
    public String getToPhoneNumListShrink() {
        return this.toPhoneNumListShrink;
    }

}
