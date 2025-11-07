// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ClusterSpec extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("DataSources")
    public java.util.List<DataSource> dataSources;

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
