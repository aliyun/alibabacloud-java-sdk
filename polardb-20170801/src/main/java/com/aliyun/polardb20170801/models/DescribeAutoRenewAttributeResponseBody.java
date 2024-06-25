// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The renewal information about the clusters.</p>
     */
    @NameInMap("Items")
    public DescribeAutoRenewAttributeResponseBodyItems items;

    /**
     * <p>The page number of the page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>65D7ACE6-4A61-4B6E-B357-8CB24A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeResponseBody self = new DescribeAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewAttributeResponseBody setItems(DescribeAutoRenewAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAutoRenewAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAutoRenewAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeAutoRenewAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute extends TeaModel {
        /**
         * <p>Indicates whether the auto-renewal feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The renewal duration.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The unit of the duration. Valid values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The renewal status. Valid values:</p>
         * <ul>
         * <li>AutoRenewal: The cluster is automatically renewed.</li>
         * <li>Normal: The cluster is manually renewed. The system sends a text message to remind you before the cluster expires.</li>
         * <li>NotRenewal: The cluster is not renewed. The system does not send a reminder for expiration but only sends a text message three days before the cluster expires to remind you that the cluster is not renewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        @NameInMap("RenewalStatus")
        public String renewalStatus;

        public static DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute self = new DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
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
