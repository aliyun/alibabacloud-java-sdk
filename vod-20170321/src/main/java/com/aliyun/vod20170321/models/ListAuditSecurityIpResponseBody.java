// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIpList")
    public java.util.List<ListAuditSecurityIpResponseBodySecurityIpList> securityIpList;

    public static ListAuditSecurityIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuditSecurityIpResponseBody self = new ListAuditSecurityIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuditSecurityIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuditSecurityIpResponseBody setSecurityIpList(java.util.List<ListAuditSecurityIpResponseBodySecurityIpList> securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public java.util.List<ListAuditSecurityIpResponseBodySecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public static class ListAuditSecurityIpResponseBodySecurityIpList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Ips")
        public String ips;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static ListAuditSecurityIpResponseBodySecurityIpList build(java.util.Map<String, ?> map) throws Exception {
            ListAuditSecurityIpResponseBodySecurityIpList self = new ListAuditSecurityIpResponseBodySecurityIpList();
            return TeaModel.build(map, self);
        }

        public ListAuditSecurityIpResponseBodySecurityIpList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAuditSecurityIpResponseBodySecurityIpList setIps(String ips) {
            this.ips = ips;
            return this;
        }
        public String getIps() {
            return this.ips;
        }

        public ListAuditSecurityIpResponseBodySecurityIpList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListAuditSecurityIpResponseBodySecurityIpList setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

}
