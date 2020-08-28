// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("IpHostPairNum")
    @Validation(required = true)
    public String ipHostPairNum;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDTCSecurityIpHostsForSQLServerResponseItems items;

    public static DescribeDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTCSecurityIpHostsForSQLServerResponse self = new DescribeDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups extends TeaModel {
        @NameInMap("SecurityIpHosts")
        @Validation(required = true)
        public String securityIpHosts;

        @NameInMap("WhitelistGroupName")
        @Validation(required = true)
        public String whitelistGroupName;

        public static DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups self = new DescribeDTCSecurityIpHostsForSQLServerResponseItemsWhiteListGroups();
            return TeaModel.build(map, self);
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

    }

}
