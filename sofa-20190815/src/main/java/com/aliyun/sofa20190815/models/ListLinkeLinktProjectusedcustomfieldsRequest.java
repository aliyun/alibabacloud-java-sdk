// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectusedcustomfieldsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static ListLinkeLinktProjectusedcustomfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectusedcustomfieldsRequest self = new ListLinkeLinktProjectusedcustomfieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectusedcustomfieldsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
