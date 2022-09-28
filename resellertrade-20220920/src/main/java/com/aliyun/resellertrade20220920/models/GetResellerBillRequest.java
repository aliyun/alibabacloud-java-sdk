// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20220920.models;

import com.aliyun.tea.*;

public class GetResellerBillRequest extends TeaModel {
    @NameInMap("BillMonth")
    public String billMonth;

    @NameInMap("BillType")
    public String billType;

    public static GetResellerBillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResellerBillRequest self = new GetResellerBillRequest();
        return TeaModel.build(map, self);
    }

    public GetResellerBillRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public GetResellerBillRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

}
