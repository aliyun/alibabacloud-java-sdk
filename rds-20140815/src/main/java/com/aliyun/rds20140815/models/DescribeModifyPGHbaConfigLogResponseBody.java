// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyPGHbaConfigLogResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1lymyn1v3i****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An array that consists of the modifications to the pg_hba.conf file.</p>
     */
    @NameInMap("HbaLogItems")
    public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems hbaLogItems;

    /**
     * <p>The number of modification records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogItemCount")
    public Integer logItemCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6D797E6B-E157-510C-A27F-6F9E6DA40633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModifyPGHbaConfigLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyPGHbaConfigLogResponseBody self = new DescribeModifyPGHbaConfigLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyPGHbaConfigLogResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeModifyPGHbaConfigLogResponseBody setHbaLogItems(DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems hbaLogItems) {
        this.hbaLogItems = hbaLogItems;
        return this;
    }
    public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems getHbaLogItems() {
        return this.hbaLogItems;
    }

    public DescribeModifyPGHbaConfigLogResponseBody setLogItemCount(Integer logItemCount) {
        this.logItemCount = logItemCount;
        return this;
    }
    public Integer getLogItemCount() {
        return this.logItemCount;
    }

    public DescribeModifyPGHbaConfigLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The mask of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The value of this parameter was set based on the value of the Method parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Option")
        public String option;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PriorityId")
        public Integer priorityId;

        /**
         * <p>The connection type.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>ldapuser</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem> hbaItem;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems setHbaItem(java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The mask of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The value of this parameter varies based on the value of the Method parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Option")
        public String option;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PriorityId")
        public Integer priorityId;

        /**
         * <p>The connection type.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem> hbaItem;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems setHbaItem(java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem extends TeaModel {
        /**
         * <p>The configurations of the pg_hba.conf file after modification.</p>
         */
        @NameInMap("AfterHbaItems")
        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems afterHbaItems;

        /**
         * <p>The configurations of the pg_hba.conf file before modification.</p>
         */
        @NameInMap("BeforeHbaItems")
        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems beforeHbaItems;

        /**
         * <p>The status of the modification.</p>
         * <ul>
         * <li><strong>success</strong>: The modification is successful.</li>
         * <li><strong>failed</strong>: The modification failed.</li>
         * <li><strong>setting</strong>: The modification is being applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ModifyStatus")
        public String modifyStatus;

        /**
         * <p>The time when the pg_hba.conf file was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-25T06:00:40Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The reason why the modification failed.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem setAfterHbaItems(DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems afterHbaItems) {
            this.afterHbaItems = afterHbaItems;
            return this;
        }
        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemAfterHbaItems getAfterHbaItems() {
            return this.afterHbaItems;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem setBeforeHbaItems(DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems beforeHbaItems) {
            this.beforeHbaItems = beforeHbaItems;
            return this;
        }
        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItemBeforeHbaItems getBeforeHbaItems() {
            return this.beforeHbaItems;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem setModifyStatus(String modifyStatus) {
            this.modifyStatus = modifyStatus;
            return this;
        }
        public String getModifyStatus() {
            return this.modifyStatus;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

    public static class DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems extends TeaModel {
        @NameInMap("HbaLogItem")
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem> hbaLogItem;

        public static DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems self = new DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyPGHbaConfigLogResponseBodyHbaLogItems setHbaLogItem(java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem> hbaLogItem) {
            this.hbaLogItem = hbaLogItem;
            return this;
        }
        public java.util.List<DescribeModifyPGHbaConfigLogResponseBodyHbaLogItemsHbaLogItem> getHbaLogItem() {
            return this.hbaLogItem;
        }

    }

}
