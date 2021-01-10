// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectongoingiterationsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static ListLinkeLinktProjectongoingiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectongoingiterationsRequest self = new ListLinkeLinktProjectongoingiterationsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectongoingiterationsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
