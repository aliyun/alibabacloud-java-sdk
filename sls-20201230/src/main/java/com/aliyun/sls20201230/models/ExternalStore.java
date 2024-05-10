// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ExternalStore extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("externalStoreName")
    public String externalStoreName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameter")
    public java.util.Map<String, ?> parameter;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("storeType")
    public String storeType;

    public static ExternalStore build(java.util.Map<String, ?> map) throws Exception {
        ExternalStore self = new ExternalStore();
        return TeaModel.build(map, self);
    }

    public ExternalStore setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public ExternalStore setParameter(java.util.Map<String, ?> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, ?> getParameter() {
        return this.parameter;
    }

    public ExternalStore setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
