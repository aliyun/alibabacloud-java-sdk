// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>Filters by cluster ID.</p>
     * <blockquote>
     * <p>This cluster ID is not the ACK cluster ID. It is the <code>id</code> field returned by this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <ul>
     * <li><code>Running</code>: The cluster is managed normally.</li>
     * <li><code>Installing</code>: An installation task is in progress for the cluster.</li>
     * <li><code>Uninstalling</code>: An uninstallation task is in progress for the cluster.</li>
     * <li><code>Upgrading</code>: An update task is in progress for the cluster.</li>
     * <li><code>Offline</code>: The cluster is offline and management is abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("cluster_status")
    public String clusterStatus;

    /**
     * <ul>
     * <li><code>ACK</code>: ACK cluster.</li>
     * <li><code>CUSTOM</code>: Custom cluster (default clusters belong to custom clusters).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The current page number (starting from page 1).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p><strong>[Deprecated]</strong> Use the cluster_id parameter to filter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Filters plugins by plugin name.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-next-upstream</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public ListClustersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClustersRequest setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public ListClustersRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListClustersRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListClustersRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListClustersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClustersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClustersRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
