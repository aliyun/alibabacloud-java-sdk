// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktProjectRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static DeleteLinkeLinktProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktProjectRequest self = new DeleteLinkeLinktProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktProjectRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
