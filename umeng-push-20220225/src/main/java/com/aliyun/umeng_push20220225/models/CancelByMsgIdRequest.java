// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class CancelByMsgIdRequest extends TeaModel {
    @NameInMap("MsgId")
    public String msgId;

    public static CancelByMsgIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelByMsgIdRequest self = new CancelByMsgIdRequest();
        return TeaModel.build(map, self);
    }

    public CancelByMsgIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
