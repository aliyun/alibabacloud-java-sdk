// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageQuality extends TeaModel {
    /**
     * <p>The overall quality score of the image. The image is automatically evaluated by AI. The evaluation is mainly based on subjective aesthetics and is affected by various factors, such as composition, brightness, contrast, color, and definition. Valid values: 0 to 1. The higher the score, the better the quality.</p>
     * 
     * <strong>example:</strong>
     * <p>0.736</p>
     */
    @NameInMap("overall_score")
    public Double overallScore;

    public static ImageQuality build(java.util.Map<String, ?> map) throws Exception {
        ImageQuality self = new ImageQuality();
        return TeaModel.build(map, self);
    }

    public ImageQuality setOverallScore(Double overallScore) {
        this.overallScore = overallScore;
        return this;
    }
    public Double getOverallScore() {
        return this.overallScore;
    }

}
