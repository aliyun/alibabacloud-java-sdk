// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudSdkServersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600F008-2E76-5D0B-BC76-EFBD****6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdkServers")
    public java.util.List<DescribeHybridCloudSdkServersResponseBodySdkServers> sdkServers;

    /**
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
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>1621428205000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>qsh5-sec-8-fedd**005</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>SDKID。</p>
         * 
         * <strong>example:</strong>
         * <p>b11327c21790846374051d5d**83c</p>
         */
        @NameInMap("Mid")
        public String mid;

        @NameInMap("ProtectionGroupAddress")
        public String protectionGroupAddress;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PullinStatus")
        public String pullinStatus;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Status")
        public String status;

        /**
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
