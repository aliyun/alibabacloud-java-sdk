// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>664BBD08-C7DB-4E*****73-9D0958D9A899</p>
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
         * <p>The time when the review security group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-22T06:54:23Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IP addresses in the review security group.</p>
         * 
         * <strong>example:</strong>
         * <p>30.27.14.0/24,30.39.127.245</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The time when the review security group was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-22T06:55:14Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The name of the review security group.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
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
