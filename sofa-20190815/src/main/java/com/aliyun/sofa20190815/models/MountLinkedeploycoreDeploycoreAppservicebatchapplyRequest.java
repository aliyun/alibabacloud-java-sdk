// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppservicebatchapplyRequest extends TeaModel {
    @NameInMap("RequestsRepeatList")
    public java.util.List<String> requestsRepeatList;

    public static MountLinkedeploycoreDeploycoreAppservicebatchapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppservicebatchapplyRequest self = new MountLinkedeploycoreDeploycoreAppservicebatchapplyRequest();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyRequest setRequestsRepeatList(java.util.List<String> requestsRepeatList) {
        this.requestsRepeatList = requestsRepeatList;
        return this;
    }
    public java.util.List<String> getRequestsRepeatList() {
        return this.requestsRepeatList;
    }

}
