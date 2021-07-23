// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class PushBillsRequest extends TeaModel {
    @NameInMap("YieldId")
    public String yieldId;

    @NameInMap("Method")
    public String method;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static PushBillsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBillsRequest self = new PushBillsRequest();
        return TeaModel.build(map, self);
    }

    public PushBillsRequest setYieldId(String yieldId) {
        this.yieldId = yieldId;
        return this;
    }
    public String getYieldId() {
        return this.yieldId;
    }

    public PushBillsRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public PushBillsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public PushBillsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
