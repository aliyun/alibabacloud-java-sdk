// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ChangeLogoRequest extends TeaModel {
    @NameInMap("ChangeColor")
    public Boolean changeColor;

    @NameInMap("ChangeFont")
    public Boolean changeFont;

    @NameInMap("ChangeIcon")
    public Boolean changeIcon;

    @NameInMap("ChangeLayout")
    public Boolean changeLayout;

    @NameInMap("GoodsId")
    public String goodsId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ChangeLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogoRequest self = new ChangeLogoRequest();
        return TeaModel.build(map, self);
    }

    public ChangeLogoRequest setChangeColor(Boolean changeColor) {
        this.changeColor = changeColor;
        return this;
    }
    public Boolean getChangeColor() {
        return this.changeColor;
    }

    public ChangeLogoRequest setChangeFont(Boolean changeFont) {
        this.changeFont = changeFont;
        return this;
    }
    public Boolean getChangeFont() {
        return this.changeFont;
    }

    public ChangeLogoRequest setChangeIcon(Boolean changeIcon) {
        this.changeIcon = changeIcon;
        return this;
    }
    public Boolean getChangeIcon() {
        return this.changeIcon;
    }

    public ChangeLogoRequest setChangeLayout(Boolean changeLayout) {
        this.changeLayout = changeLayout;
        return this;
    }
    public Boolean getChangeLayout() {
        return this.changeLayout;
    }

    public ChangeLogoRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public ChangeLogoRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ChangeLogoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
