// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaCluster extends TeaModel {
    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>RayCluster</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The datasource config.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<DataSource> dataSources;

    /**
     * <p>The service access endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.Map<String, String> endpoints;

    /**
     * <p>The container image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai-training/kmeans:v1.0.0</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static QuotaCluster build(java.util.Map<String, ?> map) throws Exception {
        QuotaCluster self = new QuotaCluster();
        return TeaModel.build(map, self);
    }

    public QuotaCluster setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public QuotaCluster setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSource> getDataSources() {
        return this.dataSources;
    }

    public QuotaCluster setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.Map<String, String> getEndpoints() {
        return this.endpoints;
    }

    public QuotaCluster setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public QuotaCluster setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
