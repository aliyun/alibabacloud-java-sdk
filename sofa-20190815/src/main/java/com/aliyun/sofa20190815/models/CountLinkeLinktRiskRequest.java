// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktRiskRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static CountLinkeLinktRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktRiskRequest self = new CountLinkeLinktRiskRequest();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktRiskRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
