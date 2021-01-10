// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectcustomfieldsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static ListLinkeLinktProjectcustomfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectcustomfieldsRequest self = new ListLinkeLinktProjectcustomfieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectcustomfieldsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
