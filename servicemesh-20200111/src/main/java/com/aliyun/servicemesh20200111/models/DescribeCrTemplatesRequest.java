// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesRequest extends TeaModel {
    @NameInMap("IstioVersion")
    public String istioVersion;

    @NameInMap("Kind")
    public String kind;

    public static DescribeCrTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrTemplatesRequest self = new DescribeCrTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrTemplatesRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public DescribeCrTemplatesRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

}
