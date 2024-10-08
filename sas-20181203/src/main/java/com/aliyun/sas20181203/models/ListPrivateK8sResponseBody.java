// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateK8sResponseBody extends TeaModel {
    @NameInMap("PrivateK8sInfos")
    public java.util.List<ListPrivateK8sResponseBodyPrivateK8sInfos> privateK8sInfos;

    /**
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateK8sResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateK8sResponseBody self = new ListPrivateK8sResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateK8sResponseBody setPrivateK8sInfos(java.util.List<ListPrivateK8sResponseBodyPrivateK8sInfos> privateK8sInfos) {
        this.privateK8sInfos = privateK8sInfos;
        return this;
    }
    public java.util.List<ListPrivateK8sResponseBodyPrivateK8sInfos> getPrivateK8sInfos() {
        return this.privateK8sInfos;
    }

    public ListPrivateK8sResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateK8sResponseBodyPrivateK8sInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("ApiServerIp")
        public String apiServerIp;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1.18</p>
         */
        @NameInMap("K8sVersion")
        public String k8sVersion;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("KubeConfig")
        public String kubeConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetType")
        public Long netType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zet5l358k6z0gnz*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListPrivateK8sResponseBodyPrivateK8sInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateK8sResponseBodyPrivateK8sInfos self = new ListPrivateK8sResponseBodyPrivateK8sInfos();
            return TeaModel.build(map, self);
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setApiServerIp(String apiServerIp) {
            this.apiServerIp = apiServerIp;
            return this;
        }
        public String getApiServerIp() {
            return this.apiServerIp;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setKubeConfig(String kubeConfig) {
            this.kubeConfig = kubeConfig;
            return this;
        }
        public String getKubeConfig() {
            return this.kubeConfig;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setNetType(Long netType) {
            this.netType = netType;
            return this;
        }
        public Long getNetType() {
            return this.netType;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrivateK8sResponseBodyPrivateK8sInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
