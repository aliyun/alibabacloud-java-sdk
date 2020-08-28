// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityIpList")
    @Validation(required = true)
    public java.util.List<ListAuditSecurityIpResponseSecurityIpList> securityIpList;

    public static ListAuditSecurityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuditSecurityIpResponse self = new ListAuditSecurityIpResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAuditSecurityIpResponseSecurityIpList extends TeaModel {
        @NameInMap("SecurityGroupName")
        @Validation(required = true)
        public String securityGroupName;

        @NameInMap("Ips")
        @Validation(required = true)
        public String ips;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        public static ListAuditSecurityIpResponseSecurityIpList build(java.util.Map<String, ?> map) throws Exception {
            ListAuditSecurityIpResponseSecurityIpList self = new ListAuditSecurityIpResponseSecurityIpList();
            return TeaModel.build(map, self);
        }

    }

}
