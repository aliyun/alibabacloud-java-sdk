// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjecttemplatesRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stamp")
    public String stamp;

    public static ListLinkeLinktProjecttemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjecttemplatesRequest self = new ListLinkeLinktProjecttemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjecttemplatesRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ListLinkeLinktProjecttemplatesRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

}
