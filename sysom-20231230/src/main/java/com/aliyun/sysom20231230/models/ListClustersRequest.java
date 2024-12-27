// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("cluster_status")
    public String clusterStatus;

    /**
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>proxy-next-upstream</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
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

}
