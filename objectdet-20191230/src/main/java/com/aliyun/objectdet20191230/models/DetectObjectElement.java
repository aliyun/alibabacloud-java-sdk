// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectElement extends TeaModel {
    @NameInMap("Height")
    public Long height;

    @NameInMap("Score")
    public Float score;

    @NameInMap("Type")
    public String type;

    @NameInMap("Width")
    public Long width;

    @NameInMap("X")
    public Long x;

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
