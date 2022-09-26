// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetCouponPageRequest extends TeaModel {
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SellerId")
    public Long sellerId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("Uids")
    public java.util.List<Long> uids;

    public static GetCouponPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCouponPageRequest self = new GetCouponPageRequest();
        return TeaModel.build(map, self);
    }

    public GetCouponPageRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetCouponPageRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCouponPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCouponPageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponPageRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public GetCouponPageRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public GetCouponPageRequest setUids(java.util.List<Long> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<Long> getUids() {
        return this.uids;
    }

}
