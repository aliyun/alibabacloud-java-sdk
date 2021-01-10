// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktBelongtoprojectsbasedonrelevantprojectRequest extends TeaModel {
    @NameInMap("RelevantProjectSign")
    public String relevantProjectSign;

    public static GetLinkeLinktBelongtoprojectsbasedonrelevantprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktBelongtoprojectsbasedonrelevantprojectRequest self = new GetLinkeLinktBelongtoprojectsbasedonrelevantprojectRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectRequest setRelevantProjectSign(String relevantProjectSign) {
        this.relevantProjectSign = relevantProjectSign;
        return this;
    }
    public String getRelevantProjectSign() {
        return this.relevantProjectSign;
    }

}
