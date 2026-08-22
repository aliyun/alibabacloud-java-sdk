// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchWhitelistsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchWhitelistsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchWhitelistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchWhitelistsResponseBody self = new DescribeOpenSearchWhitelistsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchWhitelistsResponseBody setAccessDeniedDetail(DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchWhitelistsResponseBody setData(DescribeOpenSearchWhitelistsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchWhitelistsResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchWhitelistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The authentication principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the missing permission.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail self = new DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchWhitelistsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchWhitelistsResponseBodyDataWhitelists extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-22T02:26:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_QMPRUNTIME_BROADCAST_TASK_CONSUMER_GROUP</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>ack_worker_new</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP address list.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The network type. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The policy remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nt9qxfgbzab587cshhc</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The time when the task was last updated, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>0001-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeOpenSearchWhitelistsResponseBodyDataWhitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchWhitelistsResponseBodyDataWhitelists self = new DescribeOpenSearchWhitelistsResponseBodyDataWhitelists();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setIps(String ips) {
            this.ips = ips;
            return this;
        }
        public String getIps() {
            return this.ips;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeOpenSearchWhitelistsResponseBodyDataWhitelists setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeOpenSearchWhitelistsResponseBodyData extends TeaModel {
        /**
         * <p>The type of the Internet IPv4 whitelist addresses.</p>
         */
        @NameInMap("Whitelists")
        public java.util.List<DescribeOpenSearchWhitelistsResponseBodyDataWhitelists> whitelists;

        public static DescribeOpenSearchWhitelistsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchWhitelistsResponseBodyData self = new DescribeOpenSearchWhitelistsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchWhitelistsResponseBodyData setWhitelists(java.util.List<DescribeOpenSearchWhitelistsResponseBodyDataWhitelists> whitelists) {
            this.whitelists = whitelists;
            return this;
        }
        public java.util.List<DescribeOpenSearchWhitelistsResponseBodyDataWhitelists> getWhitelists() {
            return this.whitelists;
        }

    }

}
