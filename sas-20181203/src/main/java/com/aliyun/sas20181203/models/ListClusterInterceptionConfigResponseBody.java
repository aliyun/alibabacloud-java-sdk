// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the configurations of the cluster.</p>
     */
    @NameInMap("ClusterConfigList")
    public java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> clusterConfigList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListClusterInterceptionConfigResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterInterceptionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInterceptionConfigResponseBody self = new ListClusterInterceptionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterInterceptionConfigResponseBody setClusterConfigList(java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> clusterConfigList) {
        this.clusterConfigList = clusterConfigList;
        return this;
    }
    public java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> getClusterConfigList() {
        return this.clusterConfigList;
    }

    public ListClusterInterceptionConfigResponseBody setPageInfo(ListClusterInterceptionConfigResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListClusterInterceptionConfigResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListClusterInterceptionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterInterceptionConfigResponseBodyClusterConfigList extends TeaModel {
        /**
         * <p>The status of the container firewall feature. Valid values:</p>
         * <br>
         * <p>*   **-1**: unknown</p>
         * <p>*   **0**: abnormal</p>
         * <p>*   **1**: normal</p>
         * <p>*   **2**: normal to be confirmed</p>
         */
        @NameInMap("ClusterCNNFStatus")
        public Integer clusterCNNFStatus;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **ManagedKubernetes**: managed Kubernetes cluster</p>
         * <p>*   **NotManagedKubernetes**: non-managed Kubernetes cluster</p>
         * <p>*   **PrivateKubernetes**: private cluster</p>
         * <p>*   **kubernetes**: dedicated Kubernetes cluster</p>
         * <p>*   **ask**: dedicated serverless Kubernetes (ASK) cluster</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The status of the defense rule. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("InterceptionSwitch")
        public Integer interceptionSwitch;

        /**
         * <p>The number of defense rules that are in effect.</p>
         */
        @NameInMap("OpenRuleCount")
        public Long openRuleCount;

        /**
         * <p>Indicates whether the container firewall feature is supported.</p>
         */
        @NameInMap("SupportCNNF")
        public Boolean supportCNNF;

        /**
         * <p>The total number of defense rules.</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static ListClusterInterceptionConfigResponseBodyClusterConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInterceptionConfigResponseBodyClusterConfigList self = new ListClusterInterceptionConfigResponseBodyClusterConfigList();
            return TeaModel.build(map, self);
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterCNNFStatus(Integer clusterCNNFStatus) {
            this.clusterCNNFStatus = clusterCNNFStatus;
            return this;
        }
        public Integer getClusterCNNFStatus() {
            return this.clusterCNNFStatus;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setInterceptionSwitch(Integer interceptionSwitch) {
            this.interceptionSwitch = interceptionSwitch;
            return this;
        }
        public Integer getInterceptionSwitch() {
            return this.interceptionSwitch;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setOpenRuleCount(Long openRuleCount) {
            this.openRuleCount = openRuleCount;
            return this;
        }
        public Long getOpenRuleCount() {
            return this.openRuleCount;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setSupportCNNF(Boolean supportCNNF) {
            this.supportCNNF = supportCNNF;
            return this;
        }
        public Boolean getSupportCNNF() {
            return this.supportCNNF;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class ListClusterInterceptionConfigResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrrentPage")
        public Integer currrentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClusterInterceptionConfigResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInterceptionConfigResponseBodyPageInfo self = new ListClusterInterceptionConfigResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setCurrrentPage(Integer currrentPage) {
            this.currrentPage = currrentPage;
            return this;
        }
        public Integer getCurrrentPage() {
            return this.currrentPage;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
