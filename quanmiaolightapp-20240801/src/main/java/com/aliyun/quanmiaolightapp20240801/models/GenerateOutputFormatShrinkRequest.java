// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateOutputFormatShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>clueMining</p>
     */
    @NameInMap("businessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>待分析文本</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>额外信息</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <strong>example:</strong>
     * <p>给你一条待分析文本数据，请你按照标签体系来对数据进行打标。</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    public static GenerateOutputFormatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOutputFormatShrinkRequest self = new GenerateOutputFormatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOutputFormatShrinkRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GenerateOutputFormatShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenerateOutputFormatShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GenerateOutputFormatShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public GenerateOutputFormatShrinkRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

}
