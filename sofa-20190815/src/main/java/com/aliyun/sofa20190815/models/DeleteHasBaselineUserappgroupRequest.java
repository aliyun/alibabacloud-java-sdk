// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasBaselineUserappgroupRequest extends TeaModel {
    @NameInMap("UserAppGroupId")
    public String userAppGroupId;

    public static DeleteHasBaselineUserappgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasBaselineUserappgroupRequest self = new DeleteHasBaselineUserappgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasBaselineUserappgroupRequest setUserAppGroupId(String userAppGroupId) {
        this.userAppGroupId = userAppGroupId;
        return this;
    }
    public String getUserAppGroupId() {
        return this.userAppGroupId;
    }

}
