// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyMediaInfoRequest extends TeaModel {
    // OSS存储地址
    @NameInMap("AiLabelUrl")
    public String aiLabelUrl;

    // 应用
    @NameInMap("AppId")
    public String appId;

    // 媒资业务类型
    @NameInMap("BusinessType")
    public Long businessType;

    // 分类ID
    @NameInMap("CateId")
    public Long cateId;

    // 描述
    @NameInMap("Description")
    public String description;

    // 动态数据
    @NameInMap("DynamicData")
    public String dynamicData;

    // 元数据实体ID
    @NameInMap("EntityId")
    public String entityId;

    // 智能标签，json结构
    @NameInMap("Label")
    public String label;

    // 媒资Id
    @NameInMap("MediaId")
    public String mediaId;

    // 媒资类型
    @NameInMap("MediaType")
    public Long mediaType;

    // 媒资来源
    @NameInMap("Source")
    public Long source;

    // 视频标签
    @NameInMap("Tags")
    public String tags;

    // 标题
    @NameInMap("Title")
    public String title;

    public static ModifyMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMediaInfoRequest self = new ModifyMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMediaInfoRequest setAiLabelUrl(String aiLabelUrl) {
        this.aiLabelUrl = aiLabelUrl;
        return this;
    }
    public String getAiLabelUrl() {
        return this.aiLabelUrl;
    }

    public ModifyMediaInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyMediaInfoRequest setBusinessType(Long businessType) {
        this.businessType = businessType;
        return this;
    }
    public Long getBusinessType() {
        return this.businessType;
    }

    public ModifyMediaInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public ModifyMediaInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMediaInfoRequest setDynamicData(String dynamicData) {
        this.dynamicData = dynamicData;
        return this;
    }
    public String getDynamicData() {
        return this.dynamicData;
    }

    public ModifyMediaInfoRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public ModifyMediaInfoRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ModifyMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ModifyMediaInfoRequest setMediaType(Long mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Long getMediaType() {
        return this.mediaType;
    }

    public ModifyMediaInfoRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public ModifyMediaInfoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyMediaInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
