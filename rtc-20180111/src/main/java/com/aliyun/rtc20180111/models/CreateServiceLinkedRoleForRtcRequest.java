// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForRtcRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    public static CreateServiceLinkedRoleForRtcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForRtcRequest self = new CreateServiceLinkedRoleForRtcRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForRtcRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateServiceLinkedRoleForRtcRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

}
