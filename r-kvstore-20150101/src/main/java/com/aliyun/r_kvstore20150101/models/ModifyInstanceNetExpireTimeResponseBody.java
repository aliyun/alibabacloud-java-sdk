// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Details about the extension period for which the classic network endpoint of the instance is retained.</p>
     */
    @NameInMap("NetInfoItems")
    public ModifyInstanceNetExpireTimeResponseBodyNetInfoItems netInfoItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C4AF387-1EA3-4C84-8013-3F6B973EDDF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNetExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetExpireTimeResponseBody self = new ModifyInstanceNetExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetExpireTimeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetExpireTimeResponseBody setNetInfoItems(ModifyInstanceNetExpireTimeResponseBodyNetInfoItems netInfoItems) {
        this.netInfoItems = netInfoItems;
        return this;
    }
    public ModifyInstanceNetExpireTimeResponseBodyNetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    public ModifyInstanceNetExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem extends TeaModel {
        /**
         * <p>The endpoint of the classic network.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the instance. The returned value is <strong>Classic</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The expiration time of the classic network endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T09:29:18Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address of the instance in the classic network.</p>
         * 
         * <strong>example:</strong>
         * <p>100.118.142.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The port number that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public String port;

        public static ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem self = new ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ModifyInstanceNetExpireTimeResponseBodyNetInfoItems extends TeaModel {
        @NameInMap("NetInfoItem")
        public java.util.List<ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem> netInfoItem;

        public static ModifyInstanceNetExpireTimeResponseBodyNetInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceNetExpireTimeResponseBodyNetInfoItems self = new ModifyInstanceNetExpireTimeResponseBodyNetInfoItems();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceNetExpireTimeResponseBodyNetInfoItems setNetInfoItem(java.util.List<ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem> netInfoItem) {
            this.netInfoItem = netInfoItem;
            return this;
        }
        public java.util.List<ModifyInstanceNetExpireTimeResponseBodyNetInfoItemsNetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

    }

}
