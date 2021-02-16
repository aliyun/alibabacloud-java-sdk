// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeAutoRenewAttributeResponseBodyItems items;

    public static DescribeAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeResponseBody self = new DescribeAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeAutoRenewAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoRenewAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoRenewAttributeResponseBody setItems(DescribeAutoRenewAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAutoRenewAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute self = new DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeAutoRenewAttributeResponseBodyItems extends TeaModel {
        @NameInMap("AutoRenewAttribute")
        public java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> autoRenewAttribute;

        public static DescribeAutoRenewAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseBodyItems self = new DescribeAutoRenewAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewAttributeResponseBodyItems setAutoRenewAttribute(java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> autoRenewAttribute) {
            this.autoRenewAttribute = autoRenewAttribute;
            return this;
        }
        public java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> getAutoRenewAttribute() {
            return this.autoRenewAttribute;
        }

    }

}
