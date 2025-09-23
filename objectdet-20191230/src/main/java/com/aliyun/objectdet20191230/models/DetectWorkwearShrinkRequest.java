// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWorkwearShrinkRequest extends TeaModel {
    @NameInMap("Clothes")
    public String clothesShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/zhangchaorun/tiyan/xxxx.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/zhangchaorun/tiyan/xxxx.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>1</p>
     */
    @NameInMap("Labels")
    public java.util.List<String> labels;

    public static DetectWorkwearShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWorkwearShrinkRequest self = new DetectWorkwearShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectWorkwearShrinkRequest setClothesShrink(String clothesShrink) {
        this.clothesShrink = clothesShrink;
        return this;
    }
    public String getClothesShrink() {
        return this.clothesShrink;
    }

    public DetectWorkwearShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectWorkwearShrinkRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

}
