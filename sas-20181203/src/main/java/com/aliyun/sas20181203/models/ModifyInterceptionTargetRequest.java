// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionTargetRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ImageList")
    public java.util.List<String> imageList;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("TagList")
    public java.util.List<String> tagList;

    @NameInMap("TargetId")
    public Long targetId;

    @NameInMap("TargetName")
    public String targetName;

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
