// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 分布式事务白名单条目数。; 
    @NameInMap("IpHostPairNum")
    @Validation(required = true)
    public String ipHostPairNum;

    // description: 分布式事务白名单分组列表。
    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDTCSecurityIpHostsForSQLServerResponseItems items;

    public static DescribeDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTCSecurityIpHostsForSQLServerResponse self = new DescribeDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setIpHostPairNum(String ipHostPairNum) {
        this.ipHostPairNum = ipHostPairNum;
        return this;
    }
    public String getIpHostPairNum() {
        return this.ipHostPairNum;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setItems(DescribeDTCSecurityIpHostsForSQLServerResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDTCSecurityIpHostsForSQLServerResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups extends TeaModel {
        // description: ECS实例的IP地址和Windows系统的计算机名。格式：ip,hostname。多个实例之间以英文分号（;）隔开。; 
        @NameInMap("SecurityIpHosts")
        @Validation(required = true)
        public String securityIpHosts;

        // description: 分布式事务白名单分组名称。; 
        @NameInMap("WhitelistGroupName")
        @Validation(required = true)
        public String whitelistGroupName;

        public static DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups self = new DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups setSecurityIpHosts(String securityIpHosts) {
            this.securityIpHosts = securityIpHosts;
            return this;
        }
        public String getSecurityIpHosts() {
            return this.securityIpHosts;
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups setWhitelistGroupName(String whitelistGroupName) {
            this.whitelistGroupName = whitelistGroupName;
            return this;
        }
        public String getWhitelistGroupName() {
            return this.whitelistGroupName;
        }

    }

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseItems extends TeaModel {
        @NameInMap("WhiteListGroups")
        @Validation(required = true)
        public java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups> whiteListGroups;

        public static DescribeDTCSecurityIpHostsForSQLServerResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDTCSecurityIpHostsForSQLServerResponseItems self = new DescribeDTCSecurityIpHostsForSQLServerResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDTCSecurityIpHostsForSQLServerResponseItems setWhiteListGroups(java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups> whiteListGroups) {
            this.whiteListGroups = whiteListGroups;
            return this;
        }
        public java.util.List<DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups> getWhiteListGroups() {
            return this.whiteListGroups;
        }

    }

}
