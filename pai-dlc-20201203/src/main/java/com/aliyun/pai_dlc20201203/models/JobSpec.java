// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSpec extends TeaModel {
    // Ecs实例规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 额外的Pod配置
    @NameInMap("ExtraPodSpec")
    public ExtraPodSpec extraPodSpec;

    // 镜像
    @NameInMap("Image")
    public String image;

    // 实例数量
    @NameInMap("PodCount")
    public Long podCount;

    // 资源配置
    @NameInMap("ResourceConfig")
    public ResourceConfig resourceConfig;

    // 类型
    @NameInMap("Type")
    public String type;

    public static JobSpec build(java.util.Map<String, ?> map) throws Exception {
        JobSpec self = new JobSpec();
        return TeaModel.build(map, self);
    }

    public JobSpec setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public JobSpec setExtraPodSpec(ExtraPodSpec extraPodSpec) {
        this.extraPodSpec = extraPodSpec;
        return this;
    }
    public ExtraPodSpec getExtraPodSpec() {
        return this.extraPodSpec;
    }

    public JobSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public JobSpec setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
    }

    public JobSpec setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    public JobSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
