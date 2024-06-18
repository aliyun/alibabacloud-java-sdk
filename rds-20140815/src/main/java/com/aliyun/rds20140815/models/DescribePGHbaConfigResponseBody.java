// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePGHbaConfigResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The default configuration items of the pg_hba.conf file.</p>
     */
    @NameInMap("DefaultHbaItems")
    public DescribePGHbaConfigResponseBodyDefaultHbaItems defaultHbaItems;

    /**
     * <p>The time when the previous modification was made to the pg_hba.conf file.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-25T06:00:40Z</p>
     */
    @NameInMap("HbaModifyTime")
    public String hbaModifyTime;

    /**
     * <p>The status of the previous modification to the pg_hba.conf file. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>setting</strong></li>
     * <li><strong>failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    /**
     * <p>The reason why the previous modification was made to the pg_hba.conf file.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified users (testuser) is not exist.</p>
     */
    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A147A124-A147-5CCF-9609-B73C028848DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current configuration items of the pg_hba.conf file.</p>
     */
    @NameInMap("RunningHbaItems")
    public DescribePGHbaConfigResponseBodyRunningHbaItems runningHbaItems;

    public static DescribePGHbaConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePGHbaConfigResponseBody self = new DescribePGHbaConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePGHbaConfigResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribePGHbaConfigResponseBody setDefaultHbaItems(DescribePGHbaConfigResponseBodyDefaultHbaItems defaultHbaItems) {
        this.defaultHbaItems = defaultHbaItems;
        return this;
    }
    public DescribePGHbaConfigResponseBodyDefaultHbaItems getDefaultHbaItems() {
        return this.defaultHbaItems;
    }

    public DescribePGHbaConfigResponseBody setHbaModifyTime(String hbaModifyTime) {
        this.hbaModifyTime = hbaModifyTime;
        return this;
    }
    public String getHbaModifyTime() {
        return this.hbaModifyTime;
    }

    public DescribePGHbaConfigResponseBody setLastModifyStatus(String lastModifyStatus) {
        this.lastModifyStatus = lastModifyStatus;
        return this;
    }
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    public DescribePGHbaConfigResponseBody setModifyStatusReason(String modifyStatusReason) {
        this.modifyStatusReason = modifyStatusReason;
        return this;
    }
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    public DescribePGHbaConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePGHbaConfigResponseBody setRunningHbaItems(DescribePGHbaConfigResponseBodyRunningHbaItems runningHbaItems) {
        this.runningHbaItems = runningHbaItems;
        return this;
    }
    public DescribePGHbaConfigResponseBodyRunningHbaItems getRunningHbaItems() {
        return this.runningHbaItems;
    }

    public static class DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem extends TeaModel {
        /**
         * <p>The IP addresses from which the specified users can access the specified databases. The value is fixed as 0.0.0.0/0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The names of the databases that the specified users are allowed to access. The value is fixed as all or replication.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The mask of the instance. The value is fixed as null.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The authentication method. The value is fixed as md5.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The value of this parameter is based on the value of the Method parameter. The value is fixed as null.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Option")
        public String option;

        /**
         * <p>The priority of the configuration items in the pg_hba.conf file. This value is automatically generated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PriorityId")
        public Integer priorityId;

        /**
         * <p>The type of connection to the instance. The value is fixed as host.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user that is allowed to access the instance. The value is fixed as all.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem self = new DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribePGHbaConfigResponseBodyDefaultHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> hbaItem;

        public static DescribePGHbaConfigResponseBodyDefaultHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyDefaultHbaItems self = new DescribePGHbaConfigResponseBodyDefaultHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItems setHbaItem(java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

    public static class DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
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
         * <p>The value of this parameter varies based on the value of the Method parameter. The value is fixed as null.</p>
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
         * <p>3</p>
         */
        @NameInMap("PriorityId")
        public Integer priorityId;

        /**
         * <p>The connection type. Valor:</p>
         * <ul>
         * <li><strong>host</strong>: The record matches TCP/IP connections, including SSL connections and non-SSL connections.</li>
         * <li><strong>hostssl</strong>: The record matches only TCP/IP connections that are established over SSL.</li>
         * <li><strong>hostnossl</strong>: The record matches only TCP/IP connections that are not established over SSL connections.</li>
         * </ul>
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

        public static DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem self = new DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribePGHbaConfigResponseBodyRunningHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> hbaItem;

        public static DescribePGHbaConfigResponseBodyRunningHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyRunningHbaItems self = new DescribePGHbaConfigResponseBodyRunningHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItems setHbaItem(java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

}
