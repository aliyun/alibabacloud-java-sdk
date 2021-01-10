// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovestatusRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("StatusId")
    public String statusId;

    public static CheckLinkeLinktRemovestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovestatusRequest self = new CheckLinkeLinktRemovestatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovestatusRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CheckLinkeLinktRemovestatusRequest setStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }
    public String getStatusId() {
        return this.statusId;
    }

}
