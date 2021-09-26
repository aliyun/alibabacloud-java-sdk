// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeEventsResponseBodyItems> items;

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

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEventsResponseBody setItems(java.util.List<DescribeEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeEventsResponseBodyItems extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WarnLevel")
        public Integer warnLevel;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("DealTime")
        public Long dealTime;

        @NameInMap("DealLoginName")
        public String dealLoginName;

        @NameInMap("SubTypeName")
        public String subTypeName;

        @NameInMap("Backed")
        public Boolean backed;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("SubTypeCode")
        public String subTypeCode;

        @NameInMap("TargetProductCode")
        public String targetProductCode;

        @NameInMap("TypeCode")
        public String typeCode;

        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("DealUserId")
        public Long dealUserId;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyItems self = new DescribeEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeEventsResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEventsResponseBodyItems setWarnLevel(Integer warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

        public DescribeEventsResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeEventsResponseBodyItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeEventsResponseBodyItems setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public DescribeEventsResponseBodyItems setDealLoginName(String dealLoginName) {
            this.dealLoginName = dealLoginName;
            return this;
        }
        public String getDealLoginName() {
            return this.dealLoginName;
        }

        public DescribeEventsResponseBodyItems setSubTypeName(String subTypeName) {
            this.subTypeName = subTypeName;
            return this;
        }
        public String getSubTypeName() {
            return this.subTypeName;
        }

        public DescribeEventsResponseBodyItems setBacked(Boolean backed) {
            this.backed = backed;
            return this;
        }
        public Boolean getBacked() {
            return this.backed;
        }

        public DescribeEventsResponseBodyItems setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseBodyItems setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public DescribeEventsResponseBodyItems setSubTypeCode(String subTypeCode) {
            this.subTypeCode = subTypeCode;
            return this;
        }
        public String getSubTypeCode() {
            return this.subTypeCode;
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

        public DescribeEventsResponseBodyItems setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeEventsResponseBodyItems setDealUserId(Long dealUserId) {
            this.dealUserId = dealUserId;
            return this;
        }
        public Long getDealUserId() {
            return this.dealUserId;
        }

        public DescribeEventsResponseBodyItems setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeEventsResponseBodyItems setDealDisplayName(String dealDisplayName) {
            this.dealDisplayName = dealDisplayName;
            return this;
        }
        public String getDealDisplayName() {
            return this.dealDisplayName;
        }

        public DescribeEventsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
