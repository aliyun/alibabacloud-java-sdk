// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionTargetRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yasintt-daemonst</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>An array that consists of images.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ImageList")
    public java.util.List<String> imageList;

    /**
     * <p>The namespace.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo4</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>An array that consists of tags.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The ID of the network object.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400913</p>
     */
    @NameInMap("TargetId")
    public Long targetId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The object type. Valid values:</p>
     * <ul>
     * <li><strong>IMAGE</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
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
