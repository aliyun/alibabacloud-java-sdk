// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ClusterSpec extends TeaModel {
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
     * <p>The container image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai-training/kmeans:v1.0.0</p>
     */
    @NameInMap("Image")
    public String image;

    public static ClusterSpec build(java.util.Map<String, ?> map) throws Exception {
        ClusterSpec self = new ClusterSpec();
        return TeaModel.build(map, self);
    }

    public ClusterSpec setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterSpec setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSource> getDataSources() {
        return this.dataSources;
    }

    public ClusterSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
