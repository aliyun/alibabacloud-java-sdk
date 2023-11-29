// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAppliedConfigsResponseBody extends TeaModel {
    /**
     * <p>The names of the Logtail configurations.</p>
     */
    @NameInMap("configs")
    public java.util.List<String> configs;

    /**
     * <p>The number of Logtail configurations.</p>
     */
    @NameInMap("count")
    public Integer count;

    public static GetAppliedConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedConfigsResponseBody self = new GetAppliedConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppliedConfigsResponseBody setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    public GetAppliedConfigsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
