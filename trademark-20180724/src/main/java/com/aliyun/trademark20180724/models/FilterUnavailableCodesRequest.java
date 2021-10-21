// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FilterUnavailableCodesRequest extends TeaModel {
    @NameInMap("Codes")
    public java.util.Map<String, ?> codes;

    public static FilterUnavailableCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUnavailableCodesRequest self = new FilterUnavailableCodesRequest();
        return TeaModel.build(map, self);
    }

    public FilterUnavailableCodesRequest setCodes(java.util.Map<String, ?> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.Map<String, ?> getCodes() {
        return this.codes;
    }

}
