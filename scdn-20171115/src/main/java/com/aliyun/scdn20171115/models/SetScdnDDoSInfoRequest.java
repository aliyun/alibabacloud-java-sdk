// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDDoSInfoRequest extends TeaModel {
    @NameInMap("ElasticBandwidth")
    public Integer elasticBandwidth;

    public static SetScdnDDoSInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDDoSInfoRequest self = new SetScdnDDoSInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetScdnDDoSInfoRequest setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

}
