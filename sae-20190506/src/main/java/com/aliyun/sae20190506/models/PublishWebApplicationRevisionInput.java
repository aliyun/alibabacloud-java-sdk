// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PublishWebApplicationRevisionInput extends TeaModel {
    /**
     * <p>The container configurations of the revision version.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Containers")
    public java.util.List<Container> containers;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>test version</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable Application Real-Time Monitoring Service (ARMS) monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableArmsMetrics")
    public Boolean enableArmsMetrics;

    /**
     * <p>Specifies whether to switch all traffic to a new version after the new version is released. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
