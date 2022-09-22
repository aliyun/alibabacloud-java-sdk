// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class DiscardCouponListRequest extends TeaModel {
    @NameInMap("CouponList")
    public java.util.List<Long> couponList;

    public static DiscardCouponListRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscardCouponListRequest self = new DiscardCouponListRequest();
        return TeaModel.build(map, self);
    }

    public DiscardCouponListRequest setCouponList(java.util.List<Long> couponList) {
        this.couponList = couponList;
        return this;
    }
    public java.util.List<Long> getCouponList() {
        return this.couponList;
    }

}
