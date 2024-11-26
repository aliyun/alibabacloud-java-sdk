// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationShrinkRequest extends TeaModel {
    @NameInMap("allowEmoji")
    public Boolean allowEmoji;

    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("length")
    @Deprecated
    public String length;

    @NameInMap("lengthRange")
    public String lengthRangeShrink;

    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("numComments")
    public String numComments;

    @NameInMap("sentiment")
    public String sentimentShrink;

    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    @NameInMap("style")
    @Deprecated
    public String style;

    @NameInMap("type")
    public String typeShrink;

    public static RunCommentGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationShrinkRequest self = new RunCommentGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationShrinkRequest setAllowEmoji(Boolean allowEmoji) {
        this.allowEmoji = allowEmoji;
        return this;
    }
    public Boolean getAllowEmoji() {
        return this.allowEmoji;
    }

    public RunCommentGenerationShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunCommentGenerationShrinkRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public RunCommentGenerationShrinkRequest setLengthRangeShrink(String lengthRangeShrink) {
        this.lengthRangeShrink = lengthRangeShrink;
        return this;
    }
    public String getLengthRangeShrink() {
        return this.lengthRangeShrink;
    }

    public RunCommentGenerationShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunCommentGenerationShrinkRequest setNumComments(String numComments) {
        this.numComments = numComments;
        return this;
    }
    public String getNumComments() {
        return this.numComments;
    }

    public RunCommentGenerationShrinkRequest setSentimentShrink(String sentimentShrink) {
        this.sentimentShrink = sentimentShrink;
        return this;
    }
    public String getSentimentShrink() {
        return this.sentimentShrink;
    }

    public RunCommentGenerationShrinkRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunCommentGenerationShrinkRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public RunCommentGenerationShrinkRequest setTypeShrink(String typeShrink) {
        this.typeShrink = typeShrink;
        return this;
    }
    public String getTypeShrink() {
        return this.typeShrink;
    }

}
