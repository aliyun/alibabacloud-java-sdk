// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClustersResponseBody extends TeaModel {
    /**
     * <p>The information about the clusters.</p>
     */
    @NameInMap("ClusterInfos")
    public java.util.List<DescribeHybridCloudClustersResponseBodyClusterInfos> clusterInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-ER12-WE34-23PO-301469*****E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClustersResponseBody self = new DescribeHybridCloudClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClustersResponseBody setClusterInfos(java.util.List<DescribeHybridCloudClustersResponseBodyClusterInfos> clusterInfos) {
        this.clusterInfos = clusterInfos;
        return this;
    }
    public java.util.List<DescribeHybridCloudClustersResponseBodyClusterInfos> getClusterInfos() {
        return this.clusterInfos;
    }

    public DescribeHybridCloudClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridCloudClustersResponseBodyClusterInfos extends TeaModel {
        /**
         * <p>The network access mode. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet access.</li>
         * <li><strong>vpc</strong>: internal network access by using Express Connect circuits.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        /**
         * <p>The region where the virtual private cloud (VPC) resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
         * <li><strong>cn-beiijng</strong>: China (Beijing).</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AccessRegion")
        public String accessRegion;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The ID of the hybrid cloud cluster resource.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc-cluster-t1****a</p>
         */
        @NameInMap("ClusterResourceId")
        public String clusterResourceId;

        /**
         * <p>The HTTP ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>80,8080</p>
         */
        @NameInMap("HttpPorts")
        public String httpPorts;

        /**
         * <p>The HTTPS ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>443,8443</p>
         */
        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>524**8</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of protection nodes that can be added to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectionServerCount")
        public Integer protectionServerCount;

        /**
         * <p>The status of the proxy gateway. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ProxyStatus")
        public String proxyStatus;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>cname</strong>: reverse proxy cluster.</li>
         * <li><strong>service</strong>: SDK-based traffic mirroring cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cname</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The remarks about the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The configurations of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;param&quot;:{&quot;breaker&quot;:{&quot;duration&quot;:1,&quot;failed&quot;:1,&quot;recent_failed&quot;:1},&quot;disable_protect&quot;:false,&quot;max_request_body_len&quot;:1,&quot;timeout&quot;:1}}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The status of manual bypass. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The type of the rule. Valid value:</p>
         * <ul>
         * <li><strong>bypass</strong>: Requests are allowed without security checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bypass</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeHybridCloudClustersResponseBodyClusterInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudClustersResponseBodyClusterInfos self = new DescribeHybridCloudClustersResponseBodyClusterInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setAccessRegion(String accessRegion) {
            this.accessRegion = accessRegion;
            return this;
        }
        public String getAccessRegion() {
            return this.accessRegion;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setClusterResourceId(String clusterResourceId) {
            this.clusterResourceId = clusterResourceId;
            return this;
        }
        public String getClusterResourceId() {
            return this.clusterResourceId;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setProtectionServerCount(Integer protectionServerCount) {
            this.protectionServerCount = protectionServerCount;
            return this;
        }
        public Integer getProtectionServerCount() {
            return this.protectionServerCount;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setProxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeHybridCloudClustersResponseBodyClusterInfos setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
