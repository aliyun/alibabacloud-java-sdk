// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ConfirmNotifyRequest extends TeaModel {
    @NameInMap("Confirmor")
    public Long confirmor;

    @NameInMap("NotifyIdList")
    public java.util.List<Long> notifyIdList;

    public static ConfirmNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotifyRequest self = new ConfirmNotifyRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmNotifyRequest setConfirmor(Long confirmor) {
        this.confirmor = confirmor;
        return this;
    }
    public Long getConfirmor() {
        return this.confirmor;
    }

    public ConfirmNotifyRequest setNotifyIdList(java.util.List<Long> notifyIdList) {
        this.notifyIdList = notifyIdList;
        return this;
    }
    public java.util.List<Long> getNotifyIdList() {
        return this.notifyIdList;
    }

}
