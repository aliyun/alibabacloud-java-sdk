// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rdsaiiabnaiiabn</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("Items")
    public DescribeDBInstanceSwitchLogResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>D1CA494F-CC13-4EB6-8C4D-5352EE4045BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstanceSwitchLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSwitchLogResponseBody self = new DescribeDBInstanceSwitchLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSwitchLogResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceSwitchLogResponseBody setItems(DescribeDBInstanceSwitchLogResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceSwitchLogResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceSwitchLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceSwitchLogResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstanceSwitchLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSwitchLogResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstanceSwitchLogResponseBodyItemsItem extends TeaModel {
        @NameInMap("AffectedSessions")
        public String affectedSessions;

        @NameInMap("HAStatus")
        public String HAStatus;

        @NameInMap("SwitchCauseCode")
        public String switchCauseCode;

        @NameInMap("SwitchCauseDetail")
        public String switchCauseDetail;

        @NameInMap("SwitchFinishTime")
        public String switchFinishTime;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("SwitchStartTime")
        public String switchStartTime;

        @NameInMap("TotalSessions")
        public String totalSessions;

        public static DescribeDBInstanceSwitchLogResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSwitchLogResponseBodyItemsItem self = new DescribeDBInstanceSwitchLogResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setAffectedSessions(String affectedSessions) {
            this.affectedSessions = affectedSessions;
            return this;
        }
        public String getAffectedSessions() {
            return this.affectedSessions;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setHAStatus(String HAStatus) {
            this.HAStatus = HAStatus;
            return this;
        }
        public String getHAStatus() {
            return this.HAStatus;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setSwitchCauseCode(String switchCauseCode) {
            this.switchCauseCode = switchCauseCode;
            return this;
        }
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setSwitchCauseDetail(String switchCauseDetail) {
            this.switchCauseDetail = switchCauseDetail;
            return this;
        }
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setSwitchFinishTime(String switchFinishTime) {
            this.switchFinishTime = switchFinishTime;
            return this;
        }
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setSwitchStartTime(String switchStartTime) {
            this.switchStartTime = switchStartTime;
            return this;
        }
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

        public DescribeDBInstanceSwitchLogResponseBodyItemsItem setTotalSessions(String totalSessions) {
            this.totalSessions = totalSessions;
            return this;
        }
        public String getTotalSessions() {
            return this.totalSessions;
        }

    }

    public static class DescribeDBInstanceSwitchLogResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeDBInstanceSwitchLogResponseBodyItemsItem> item;

        public static DescribeDBInstanceSwitchLogResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSwitchLogResponseBodyItems self = new DescribeDBInstanceSwitchLogResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSwitchLogResponseBodyItems setItem(java.util.List<DescribeDBInstanceSwitchLogResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeDBInstanceSwitchLogResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
