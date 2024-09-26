// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("length")
    public String length;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("numComments")
    public String numComments;

    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    @NameInMap("style")
    public String style;

    public static RunCommentGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationRequest self = new RunCommentGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public RunCommentGenerationRequest setNumComments(String numComments) {
        this.numComments = numComments;
        return this;
    }
    public String getNumComments() {
        return this.numComments;
    }

    public RunCommentGenerationRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunCommentGenerationRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

}
