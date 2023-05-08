// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetLogoFontListRequest extends TeaModel {
    /**
     * <p>type</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetLogoFontListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogoFontListRequest self = new GetLogoFontListRequest();
        return TeaModel.build(map, self);
    }

    public GetLogoFontListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
