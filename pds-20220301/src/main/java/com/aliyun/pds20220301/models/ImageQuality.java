// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageQuality extends TeaModel {
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
