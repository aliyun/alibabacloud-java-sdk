// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ConfirmNotifyRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used to confirm the notification. You can set this parameter to **0**, which indicates that the notification is confirmed by the system.</p>
     */
    @NameInMap("Confirmor")
    public Long confirmor;

    /**
     * <p>The notification IDs.</p>
     */
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
