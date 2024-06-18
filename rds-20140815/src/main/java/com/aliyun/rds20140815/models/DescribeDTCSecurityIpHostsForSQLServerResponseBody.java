// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The number of distributed transaction whitelists.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IpHostPairNum")
    public String ipHostPairNum;

    /**
     * <p>Details of distributed transaction whitelists.</p>
     */
    @NameInMap("Items")
    public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CA62A70-2203-45C6-8E90-8971D5ACC0C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDTCSecurityIpHostsForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTCSecurityIpHostsForSQLServerResponseBody self = new DescribeDTCSecurityIpHostsForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponseBody setIpHostPairNum(String ipHostPairNum) {
        this.ipHostPairNum = ipHostPairNum;
        return this;
    }
    public String getIpHostPairNum() {
        return this.ipHostPairNum;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponseBody setItems(DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups extends TeaModel {
        /**
         * <p>The IP address of the ECS instance and the hostname of the Windows computer. Format: <code>IP address,Hostname</code>. Multiple values are separated with semicolons (;).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.100,k3ecstest</p>
         */
        @NameInMap("SecurityIpHosts")
        public String securityIpHosts;

        /**
         * <p>The name of the distributed transaction whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("WhitelistGroupName")
        public String whitelistGroupName;

        public static DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups self = new DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups setSecurityIpHosts(String securityIpHosts) {
            this.securityIpHosts = securityIpHosts;
            return this;
        }
        public String getSecurityIpHosts() {
            return this.securityIpHosts;
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups setWhitelistGroupName(String whitelistGroupName) {
            this.whitelistGroupName = whitelistGroupName;
            return this;
        }
        public String getWhitelistGroupName() {
            return this.whitelistGroupName;
        }

    }

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems extends TeaModel {
        @NameInMap("WhiteListGroups")
        public java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups> whiteListGroups;

        public static DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems self = new DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems setWhiteListGroups(java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups> whiteListGroups) {
            this.whiteListGroups = whiteListGroups;
            return this;
        }
        public java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups> getWhiteListGroups() {
            return this.whiteListGroups;
        }

    }

}
