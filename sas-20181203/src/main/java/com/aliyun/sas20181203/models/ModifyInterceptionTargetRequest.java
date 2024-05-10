// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionTargetRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>> You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>An array that consists of images.</p>
     * <br>
     * <p>> You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.</p>
     */
    @NameInMap("ImageList")
    public java.util.List<String> imageList;

    /**
     * <p>The namespace.</p>
     * <br>
     * <p>> You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>An array that consists of tags.</p>
     * <br>
     * <p>> You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.</p>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The ID of the network object.</p>
     * <br>
     * <p>> You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to obtain the value of this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetId")
    public Long targetId;

    /**
     * <p>The name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The object type. Valid values:</p>
     * <br>
     * <p>*   **IMAGE**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ModifyInterceptionTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionTargetRequest self = new ModifyInterceptionTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionTargetRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyInterceptionTargetRequest setImageList(java.util.List<String> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<String> getImageList() {
        return this.imageList;
    }

    public ModifyInterceptionTargetRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyInterceptionTargetRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public ModifyInterceptionTargetRequest setTargetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }
    public Long getTargetId() {
        return this.targetId;
    }

    public ModifyInterceptionTargetRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ModifyInterceptionTargetRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
