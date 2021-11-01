// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectElement extends TeaModel {
    // 目标高度(像素)
    @NameInMap("Height")
    public Long height;

    // 目标置信度，范围为[0.0, 1.0]
    @NameInMap("Score")
    public Float score;

    // 目标类型：PERSON, VEHICLE, PET
    @NameInMap("Type")
    public String type;

    // 目标宽度(像素)
    @NameInMap("Width")
    public Long width;

    // 左上角x坐标(像素)
    @NameInMap("X")
    public Long x;

    // 左上角y坐标(像素)
    @NameInMap("Y")
    public Long y;

    public static DetectObjectElement build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectElement self = new DetectObjectElement();
        return TeaModel.build(map, self);
    }

    public DetectObjectElement setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public DetectObjectElement setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public DetectObjectElement setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetectObjectElement setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public DetectObjectElement setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public DetectObjectElement setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

}
