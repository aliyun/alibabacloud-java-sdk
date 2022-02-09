// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    // 集群的部署类型。<br> - multiple：多机房 <br>- single：单机房 <br>- dual：双机房
    @NameInMap("DeployType")
    public String deployType;

    // 存储空间大小，单位GB。 存储空间的限制根据集群规格不同而不同，具体如下： - 8C32GB：100GB~10000GB - 14C70GB：200GB~1000GB - 30C180GB：400GB~10000GB - 62C400G：800GB-10000GB。 各套餐的存储空间默认值为其最小值。
    @NameInMap("DiskSize")
    public Long diskSize;

    // 磁盘类型，待扩展，当前均为cloud_essd
    @NameInMap("DiskType")
    public String diskType;

    // 集群规格信息。 当前支持四种套餐： - 8C32GB：8核 32GB - 14C70GB（默认）：14核 70GB - 30C180GB：30核 180GB - 62C400GB：62核 400GB
    @NameInMap("InstanceClass")
    public String instanceClass;

    // Oceanbase集群的系列 - normal（默认）：高可用版本 - basic：基础版本
    @NameInMap("Series")
    public String series;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public DescribeAvailableResourceRequest setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Long getDiskSize() {
        return this.diskSize;
    }

    public DescribeAvailableResourceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeAvailableResourceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeAvailableResourceRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

}
