// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetOfficePreviewUrlOption extends TeaModel {
    @NameInMap("copy")
    public Boolean copy;

    @NameInMap("print")
    public Boolean print;

    public static GetOfficePreviewUrlOption build(java.util.Map<String, ?> map) throws Exception {
        GetOfficePreviewUrlOption self = new GetOfficePreviewUrlOption();
        return TeaModel.build(map, self);
    }

    public GetOfficePreviewUrlOption setCopy(Boolean copy) {
        this.copy = copy;
        return this;
    }
    public Boolean getCopy() {
        return this.copy;
    }

    public GetOfficePreviewUrlOption setPrint(Boolean print) {
        this.print = print;
        return this;
    }
    public Boolean getPrint() {
        return this.print;
    }

}
