// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLicensesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("NeedTotalCount")
    public Boolean needTotalCount;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Orders")
    public java.util.List<ListLicensesRequestOrders> orders;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PkgName")
    public String pkgName;

    @NameInMap("PlatformType")
    public Long platformType;

    @NameInMap("Product")
    public String product;

    @NameInMap("UserId")
    public Long userId;

    public static ListLicensesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLicensesRequest self = new ListLicensesRequest();
        return TeaModel.build(map, self);
    }

    public ListLicensesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLicensesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListLicensesRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public ListLicensesRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListLicensesRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListLicensesRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListLicensesRequest setOrders(java.util.List<ListLicensesRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<ListLicensesRequestOrders> getOrders() {
        return this.orders;
    }

    public ListLicensesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLicensesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLicensesRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public ListLicensesRequest setPlatformType(Long platformType) {
        this.platformType = platformType;
        return this;
    }
    public Long getPlatformType() {
        return this.platformType;
    }

    public ListLicensesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListLicensesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class ListLicensesRequestOrders extends TeaModel {
        @NameInMap("OrderBy")
        public String orderBy;

        @NameInMap("OrderDirection")
        public String orderDirection;

        public static ListLicensesRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            ListLicensesRequestOrders self = new ListLicensesRequestOrders();
            return TeaModel.build(map, self);
        }

        public ListLicensesRequestOrders setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

        public ListLicensesRequestOrders setOrderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }
        public String getOrderDirection() {
            return this.orderDirection;
        }

    }

}
