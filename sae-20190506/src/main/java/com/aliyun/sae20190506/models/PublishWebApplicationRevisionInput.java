// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PublishWebApplicationRevisionInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Containers")
    public java.util.List<Container> containers;

    /**
     * <strong>example:</strong>
     * <p>test version</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableArmsMetrics")
    public Boolean enableArmsMetrics;

    @NameInMap("TakeEffect")
    public Boolean takeEffect;

    public static PublishWebApplicationRevisionInput build(java.util.Map<String, ?> map) throws Exception {
        PublishWebApplicationRevisionInput self = new PublishWebApplicationRevisionInput();
        return TeaModel.build(map, self);
    }

    public PublishWebApplicationRevisionInput setContainers(java.util.List<Container> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<Container> getContainers() {
        return this.containers;
    }

    public PublishWebApplicationRevisionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishWebApplicationRevisionInput setEnableArmsMetrics(Boolean enableArmsMetrics) {
        this.enableArmsMetrics = enableArmsMetrics;
        return this;
    }
    public Boolean getEnableArmsMetrics() {
        return this.enableArmsMetrics;
    }

    public PublishWebApplicationRevisionInput setTakeEffect(Boolean takeEffect) {
        this.takeEffect = takeEffect;
        return this;
    }
    public Boolean getTakeEffect() {
        return this.takeEffect;
    }

}
