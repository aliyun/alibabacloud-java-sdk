// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetOfficeEditUrlOption extends TeaModel {
    @NameInMap("copy")
    public Boolean copy;

    @NameInMap("print")
    public Boolean print;

    @NameInMap("readonly")
    public Boolean readonly;

    public static GetOfficeEditUrlOption build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeEditUrlOption self = new GetOfficeEditUrlOption();
        return TeaModel.build(map, self);
    }

    public GetOfficeEditUrlOption setCopy(Boolean copy) {
        this.copy = copy;
        return this;
    }
    public Boolean getCopy() {
        return this.copy;
    }

    public GetOfficeEditUrlOption setPrint(Boolean print) {
        this.print = print;
        return this;
    }
    public Boolean getPrint() {
        return this.print;
    }

    public GetOfficeEditUrlOption setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

}
