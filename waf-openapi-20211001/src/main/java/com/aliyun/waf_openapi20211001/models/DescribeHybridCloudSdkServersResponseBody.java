// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudSdkServersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3600F008-2E76-5D0B-BC76-EFBD****6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the hybrid cloud SDK servers.</p>
     */
    @NameInMap("SdkServers")
    public java.util.List<DescribeHybridCloudSdkServersResponseBodySdkServers> sdkServers;

    /**
     * <p>The total number of hybrid cloud SDK servers returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHybridCloudSdkServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudSdkServersResponseBody self = new DescribeHybridCloudSdkServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudSdkServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudSdkServersResponseBody setSdkServers(java.util.List<DescribeHybridCloudSdkServersResponseBodySdkServers> sdkServers) {
        this.sdkServers = sdkServers;
        return this;
    }
    public java.util.List<DescribeHybridCloudSdkServersResponseBodySdkServers> getSdkServers() {
        return this.sdkServers;
    }

    public DescribeHybridCloudSdkServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudSdkServersResponseBodySdkServers extends TeaModel {
        /**
         * <p>The name of the hybrid cloud cluster to which the SDK server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>testcluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the hybrid cloud SDK server was created. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1621428205000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The hostname of the hybrid cloud SDK server.</p>
         * 
         * <strong>example:</strong>
         * <p>qsh5-sec-8-fedd**005</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the hybrid cloud SDK server.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the SDK server.</p>
         * 
         * <strong>example:</strong>
         * <p>b11327c21790846374051d5d**83c</p>
         */
        @NameInMap("Mid")
        public String mid;

        /**
         * <p>The address of the protection group associated with the SDK server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("ProtectionGroupAddress")
        public String protectionGroupAddress;

        /**
         * <p>Indicates whether traffic redirection is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Traffic redirection is enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Traffic redirection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PullinStatus")
        public String pullinStatus;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test-antifaud-2.jqt.wafqax.top-waf</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the hybrid cloud SDK server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the hybrid cloud SDK server was last updated. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719489906000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeHybridCloudSdkServersResponseBodySdkServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudSdkServersResponseBodySdkServers self = new DescribeHybridCloudSdkServersResponseBodySdkServers();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setProtectionGroupAddress(String protectionGroupAddress) {
            this.protectionGroupAddress = protectionGroupAddress;
            return this;
        }
        public String getProtectionGroupAddress() {
            return this.protectionGroupAddress;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setPullinStatus(String pullinStatus) {
            this.pullinStatus = pullinStatus;
            return this;
        }
        public String getPullinStatus() {
            return this.pullinStatus;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHybridCloudSdkServersResponseBodySdkServers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
