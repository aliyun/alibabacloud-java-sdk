// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GenerateMergedTableRequest extends TeaModel {
    @NameInMap("spec")
    public String spec;

    public static GenerateMergedTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateMergedTableRequest self = new GenerateMergedTableRequest();
        return TeaModel.build(map, self);
    }

    public GenerateMergedTableRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
