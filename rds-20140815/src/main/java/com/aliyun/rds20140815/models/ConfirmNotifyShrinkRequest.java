// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ConfirmNotifyShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used to confirm the notification. You can set this parameter to <strong>0</strong>, which indicates that the notification is confirmed by the system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Confirmor")
    public Long confirmor;

    /**
     * <p>The notification IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("NotifyIdList")
    public String notifyIdListShrink;

    public static ConfirmNotifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotifyShrinkRequest self = new ConfirmNotifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmNotifyShrinkRequest setConfirmor(Long confirmor) {
        this.confirmor = confirmor;
        return this;
    }
    public Long getConfirmor() {
        return this.confirmor;
    }

    public ConfirmNotifyShrinkRequest setNotifyIdListShrink(String notifyIdListShrink) {
        this.notifyIdListShrink = notifyIdListShrink;
        return this;
    }
    public String getNotifyIdListShrink() {
        return this.notifyIdListShrink;
    }

}
