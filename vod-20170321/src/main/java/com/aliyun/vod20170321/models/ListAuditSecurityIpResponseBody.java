// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the review security group.</p>
     */
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
        /**
         * <p>The time when the review security group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IP addresses in the review security group.</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The time when the review security group was last modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The name of the review security group.</p>
         */
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
