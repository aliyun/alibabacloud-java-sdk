// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionTargetRequest extends TeaModel {
    /**
     * <p>The name of the application to which the network object belongs.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>An array that consists of the images of the network object.</p>
     */
    @NameInMap("ImageList")
    public java.util.List<String> imageList;

    /**
     * <p>The namespace to which the network object belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>An array that consists of the labels specified for the network object.</p>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The object name.</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The object type. Valid value: </p>
     * <p>- **IMAGE**: specifies an image</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateInterceptionTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionTargetRequest self = new CreateInterceptionTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionTargetRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateInterceptionTargetRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInterceptionTargetRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInterceptionTargetRequest setImageList(java.util.List<String> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<String> getImageList() {
        return this.imageList;
    }

    public CreateInterceptionTargetRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateInterceptionTargetRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public CreateInterceptionTargetRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CreateInterceptionTargetRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
