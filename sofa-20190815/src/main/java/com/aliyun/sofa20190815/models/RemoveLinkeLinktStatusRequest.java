// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktStatusRequest extends TeaModel {
    @NameInMap("StatusConvertMap")
    public String statusConvertMap;

    @NameInMap("StatusId")
    public String statusId;

    public static RemoveLinkeLinktStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktStatusRequest self = new RemoveLinkeLinktStatusRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktStatusRequest setStatusConvertMap(String statusConvertMap) {
        this.statusConvertMap = statusConvertMap;
        return this;
    }
    public String getStatusConvertMap() {
        return this.statusConvertMap;
    }

    public RemoveLinkeLinktStatusRequest setStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }
    public String getStatusId() {
        return this.statusId;
    }

}
