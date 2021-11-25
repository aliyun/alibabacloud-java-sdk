// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryRingDetailListShrinkRequest extends TeaModel {
    @NameInMap("CallOutStatus")
    public String callOutStatus;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("FromPhoneNumList")
    public String fromPhoneNumListShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("ToPhoneNumList")
    public String toPhoneNumListShrink;

    public static QueryRingDetailListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRingDetailListShrinkRequest self = new QueryRingDetailListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryRingDetailListShrinkRequest setCallOutStatus(String callOutStatus) {
        this.callOutStatus = callOutStatus;
        return this;
    }
    public String getCallOutStatus() {
        return this.callOutStatus;
    }

    public QueryRingDetailListShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryRingDetailListShrinkRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryRingDetailListShrinkRequest setFromPhoneNumListShrink(String fromPhoneNumListShrink) {
        this.fromPhoneNumListShrink = fromPhoneNumListShrink;
        return this;
    }
    public String getFromPhoneNumListShrink() {
        return this.fromPhoneNumListShrink;
    }

    public QueryRingDetailListShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRingDetailListShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRingDetailListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRingDetailListShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryRingDetailListShrinkRequest setToPhoneNumListShrink(String toPhoneNumListShrink) {
        this.toPhoneNumListShrink = toPhoneNumListShrink;
        return this;
    }
    public String getToPhoneNumListShrink() {
        return this.toPhoneNumListShrink;
    }

}
