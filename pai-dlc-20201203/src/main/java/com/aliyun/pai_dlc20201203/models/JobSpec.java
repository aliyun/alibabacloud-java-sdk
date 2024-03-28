// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSpec extends TeaModel {
    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("ExtraPodSpec")
    public ExtraPodSpec extraPodSpec;

    @NameInMap("Image")
    public String image;

    @NameInMap("ImageConfig")
    public ImageConfig imageConfig;

    @NameInMap("PodCount")
    public Long podCount;

    @NameInMap("ResourceConfig")
    public ResourceConfig resourceConfig;

    @NameInMap("SpotSpec")
    public SpotSpec spotSpec;

    @NameInMap("Type")
    public String type;

    @NameInMap("UseSpotInstance")
    public Boolean useSpotInstance;

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

    public JobSpec setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public ImageConfig getImageConfig() {
        return this.imageConfig;
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

    public JobSpec setSpotSpec(SpotSpec spotSpec) {
        this.spotSpec = spotSpec;
        return this;
    }
    public SpotSpec getSpotSpec() {
        return this.spotSpec;
    }

    public JobSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public JobSpec setUseSpotInstance(Boolean useSpotInstance) {
        this.useSpotInstance = useSpotInstance;
        return this;
    }
    public Boolean getUseSpotInstance() {
        return this.useSpotInstance;
    }

}
