// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DependLibraryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CatalogCommonResult result;

    public static DependLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DependLibraryResponseBody self = new DependLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public DependLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DependLibraryResponseBody setResult(CatalogCommonResult result) {
        this.result = result;
        return this;
    }
    public CatalogCommonResult getResult() {
        return this.result;
    }

}
