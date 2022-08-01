// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListExternalStoreRequest extends TeaModel {
    @NameInMap("externalStoreName")
    public String externalStoreName;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("sizs")
    public Integer sizs;

    public static ListExternalStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExternalStoreRequest self = new ListExternalStoreRequest();
        return TeaModel.build(map, self);
    }

    public ListExternalStoreRequest setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public ListExternalStoreRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListExternalStoreRequest setSizs(Integer sizs) {
        this.sizs = sizs;
        return this;
    }
    public Integer getSizs() {
        return this.sizs;
    }

}
