// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectmodulesRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static ListLinkeLinktProjectmodulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectmodulesRequest self = new ListLinkeLinktProjectmodulesRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectmodulesRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
