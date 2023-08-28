// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetOfficeEditUrlWatermark extends TeaModel {
    @NameInMap("fillstyle")
    public String fillstyle;

    @NameInMap("font")
    public String font;

    @NameInMap("horizontal")
    public Long horizontal;

    @NameInMap("rotate")
    public Double rotate;

    @NameInMap("type")
    public Integer type;

    @NameInMap("value")
    public String value;

    @NameInMap("vertical")
    public Long vertical;

    public static GetOfficeEditUrlWatermark build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeEditUrlWatermark self = new GetOfficeEditUrlWatermark();
        return TeaModel.build(map, self);
    }

    public GetOfficeEditUrlWatermark setFillstyle(String fillstyle) {
        this.fillstyle = fillstyle;
        return this;
    }
    public String getFillstyle() {
        return this.fillstyle;
    }

    public GetOfficeEditUrlWatermark setFont(String font) {
        this.font = font;
        return this;
    }
    public String getFont() {
        return this.font;
    }

    public GetOfficeEditUrlWatermark setHorizontal(Long horizontal) {
        this.horizontal = horizontal;
        return this;
    }
    public Long getHorizontal() {
        return this.horizontal;
    }

    public GetOfficeEditUrlWatermark setRotate(Double rotate) {
        this.rotate = rotate;
        return this;
    }
    public Double getRotate() {
        return this.rotate;
    }

    public GetOfficeEditUrlWatermark setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public GetOfficeEditUrlWatermark setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public GetOfficeEditUrlWatermark setVertical(Long vertical) {
        this.vertical = vertical;
        return this;
    }
    public Long getVertical() {
        return this.vertical;
    }

}
