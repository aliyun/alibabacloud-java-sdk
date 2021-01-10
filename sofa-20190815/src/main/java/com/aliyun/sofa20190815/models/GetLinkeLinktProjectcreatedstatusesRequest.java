// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktProjectcreatedstatusesRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static GetLinkeLinktProjectcreatedstatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktProjectcreatedstatusesRequest self = new GetLinkeLinktProjectcreatedstatusesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktProjectcreatedstatusesRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
