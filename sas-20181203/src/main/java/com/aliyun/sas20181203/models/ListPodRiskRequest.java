// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPodRiskRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the pod.</p>
     */
    @NameInMap("PodName")
    public String podName;

    public static ListPodRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPodRiskRequest self = new ListPodRiskRequest();
        return TeaModel.build(map, self);
    }

    public ListPodRiskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPodRiskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPodRiskRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListPodRiskRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListPodRiskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPodRiskRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

}
