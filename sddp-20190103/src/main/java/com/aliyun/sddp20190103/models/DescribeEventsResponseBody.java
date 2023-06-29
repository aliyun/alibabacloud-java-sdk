// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the anomalous events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeEventsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The time when an alert was triggered for the anomalous event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>Indicates whether the detection of anomalous events is enhanced. If the detection of anomalous events is enhanced, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
         */
        @NameInMap("Backed")
        public Boolean backed;

        /**
         * <p>The display name of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        /**
         * <p>The username of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealLoginName")
        public String dealLoginName;

        /**
         * <p>The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealUserId")
        public Long dealUserId;

        /**
         * <p>The display name of the account that triggered the anomalous event.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The ID of the anomalous event.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The username of the account that triggered the anomalous event.</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The name of the service in which the anomalous event was detected.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The handling status for the anomalous event. Valid values:</p>
         * <br>
         * <p>*   0: unhandled</p>
         * <p>*   1: confirmed</p>
         * <p>*   2: marked as false positive</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the handling status for the anomalous event.</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The code of the anomalous event subtype.</p>
         */
        @NameInMap("SubTypeCode")
        public String subTypeCode;

        /**
         * <p>The name of the anomalous event subtype.</p>
         */
        @NameInMap("SubTypeName")
        public String subTypeName;

        /**
         * <p>The name of the destination service in an anomalous data flow.</p>
         */
        @NameInMap("TargetProductCode")
        public String targetProductCode;

        /**
         * <p>The code of the anomalous event type.</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        /**
         * <p>The name of the anomalous event type.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The ID of the account that triggered the anomalous event.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The severity of the anomalous event.</p>
         * <br>
         * <p>*   **1**: low</p>
         * <p>*   **2**: medium</p>
         * <p>*   **3**: high</p>
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
