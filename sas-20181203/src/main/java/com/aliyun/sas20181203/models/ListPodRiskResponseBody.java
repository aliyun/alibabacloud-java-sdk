// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPodRiskResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListPodRiskResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the risks.</p>
     */
    @NameInMap("PodRiskList")
    public java.util.List<ListPodRiskResponseBodyPodRiskList> podRiskList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPodRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPodRiskResponseBody self = new ListPodRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPodRiskResponseBody setPageInfo(ListPodRiskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListPodRiskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListPodRiskResponseBody setPodRiskList(java.util.List<ListPodRiskResponseBodyPodRiskList> podRiskList) {
        this.podRiskList = podRiskList;
        return this;
    }
    public java.util.List<ListPodRiskResponseBodyPodRiskList> getPodRiskList() {
        return this.podRiskList;
    }

    public ListPodRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPodRiskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

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

        public static ListPodRiskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPodRiskResponseBodyPageInfo self = new ListPodRiskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListPodRiskResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListPodRiskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListPodRiskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPodRiskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListPodRiskResponseBodyPodRiskList extends TeaModel {
        /**
         * <p>The number of alerts that are generated for the pod.</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>The ID of the container cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The timestamp when the pod was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of baseline risk items that are detected in the pod.</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The name of the pod.</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The IP address of the pod.</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The number of vulnerabilities that are detected in the pod.</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static ListPodRiskResponseBodyPodRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListPodRiskResponseBodyPodRiskList self = new ListPodRiskResponseBodyPodRiskList();
            return TeaModel.build(map, self);
        }

        public ListPodRiskResponseBodyPodRiskList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public ListPodRiskResponseBodyPodRiskList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPodRiskResponseBodyPodRiskList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListPodRiskResponseBodyPodRiskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPodRiskResponseBodyPodRiskList setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public ListPodRiskResponseBodyPodRiskList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPodRiskResponseBodyPodRiskList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListPodRiskResponseBodyPodRiskList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListPodRiskResponseBodyPodRiskList setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public ListPodRiskResponseBodyPodRiskList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public ListPodRiskResponseBodyPodRiskList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

}
