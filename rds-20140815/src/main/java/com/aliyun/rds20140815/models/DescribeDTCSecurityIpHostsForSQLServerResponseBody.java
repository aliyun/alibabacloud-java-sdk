// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("IpHostPairNum")
    public String ipHostPairNum;

    @NameInMap("Items")
    public DescribeDTCSecurityIpHostsForSQLServerResponseBodyItems items;

    public static DescribeDTCSecurityIpHostsForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTCSecurityIpHostsForSQLServerResponseBody self = new DescribeDTCSecurityIpHostsForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseBodyItemsWhiteListGroups extends TeaModel {
        @NameInMap("SecurityIpHosts")
        public String securityIpHosts;

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
