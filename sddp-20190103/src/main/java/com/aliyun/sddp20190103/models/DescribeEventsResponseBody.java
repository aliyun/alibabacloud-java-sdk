// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of anomalous activities.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeEventsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventsResponseBody setItems(java.util.List<DescribeEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventsResponseBodyItems extends TeaModel {
        /**
         * <p>The time when an alert was generated for the anomalous activity. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>154529000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>Indicates whether enhanced detection is enabled for the anomalous activity. Enhanced detection improves detection accuracy and the alert reporting rate.</p>
         * <ul>
         * <li><p>true: Enhanced detection is enabled.</p>
         * </li>
         * <li><p>false: Enhanced detection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Backed")
        public Boolean backed;

        /**
         * <p>The display name of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>yundunsr</p>
         */
        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        /**
         * <p>The logon name of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>det1111</p>
         */
        @NameInMap("DealLoginName")
        public String dealLoginName;

        /**
         * <p>The time when the anomalous activity was handled. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12223300</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>229157443385014***</p>
         */
        @NameInMap("DealUserId")
        public Long dealUserId;

        /**
         * <p>The display name of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>yundunsr</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the anomalous activity occurred. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545829129000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The unique ID of the anomalous activity that is recorded in Data Security Center (DSC).</p>
         * 
         * <strong>example:</strong>
         * <p>42233335555</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The logon name of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>det1111</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The service to which the anomalous activity belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The processing status of the anomalous activity.</p>
         * <ul>
         * <li><p>0: Unhandled.</p>
         * </li>
         * <li><p>1: Confirmed.</p>
         * </li>
         * <li><p>2: Dismissed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The code of the child type of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>020008</p>
         */
        @NameInMap("SubTypeCode")
        public String subTypeCode;

        /**
         * <p>The name of the child type of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Abnormal data download volume</p>
         */
        @NameInMap("SubTypeName")
        public String subTypeName;

        /**
         * <p>The destination service for the anomalous data flow event.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("TargetProductCode")
        public String targetProductCode;

        /**
         * <p>The code of the parent type of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        /**
         * <p>The name of the parent type of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Abnormal data flow</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The ID of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1978132506596***</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The risk level of the anomalous activity.</p>
         * <ul>
         * <li><p><strong>1</strong>: Low.</p>
         * </li>
         * <li><p><strong>2</strong>: Medium.</p>
         * </li>
         * <li><p><strong>3</strong>: High.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WarnLevel")
        public Integer warnLevel;

        public static DescribeEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyItems self = new DescribeEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyItems setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeEventsResponseBodyItems setBacked(Boolean backed) {
            this.backed = backed;
            return this;
        }
        public Boolean getBacked() {
            return this.backed;
        }

        public DescribeEventsResponseBodyItems setDealDisplayName(String dealDisplayName) {
            this.dealDisplayName = dealDisplayName;
            return this;
        }
        public String getDealDisplayName() {
            return this.dealDisplayName;
        }

        public DescribeEventsResponseBodyItems setDealLoginName(String dealLoginName) {
            this.dealLoginName = dealLoginName;
            return this;
        }
        public String getDealLoginName() {
            return this.dealLoginName;
        }

        public DescribeEventsResponseBodyItems setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public DescribeEventsResponseBodyItems setDealUserId(Long dealUserId) {
            this.dealUserId = dealUserId;
            return this;
        }
        public Long getDealUserId() {
            return this.dealUserId;
        }

        public DescribeEventsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeEventsResponseBodyItems setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventsResponseBodyItems setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public DescribeEventsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeEventsResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEventsResponseBodyItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeEventsResponseBodyItems setSubTypeCode(String subTypeCode) {
            this.subTypeCode = subTypeCode;
            return this;
        }
        public String getSubTypeCode() {
            return this.subTypeCode;
        }

        public DescribeEventsResponseBodyItems setSubTypeName(String subTypeName) {
            this.subTypeName = subTypeName;
            return this;
        }
        public String getSubTypeName() {
            return this.subTypeName;
        }

        public DescribeEventsResponseBodyItems setTargetProductCode(String targetProductCode) {
            this.targetProductCode = targetProductCode;
            return this;
        }
        public String getTargetProductCode() {
            return this.targetProductCode;
        }

        public DescribeEventsResponseBodyItems setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public DescribeEventsResponseBodyItems setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeEventsResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeEventsResponseBodyItems setWarnLevel(Integer warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

    }

}
