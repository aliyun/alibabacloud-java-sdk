// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetTextLogoListRequest extends TeaModel {
    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("FontId")
    public String fontId;

    public static GetTextLogoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextLogoListRequest self = new GetTextLogoListRequest();
        return TeaModel.build(map, self);
    }

    public GetTextLogoListRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public GetTextLogoListRequest setFontId(String fontId) {
        this.fontId = fontId;
        return this;
    }
    public String getFontId() {
        return this.fontId;
    }

}
