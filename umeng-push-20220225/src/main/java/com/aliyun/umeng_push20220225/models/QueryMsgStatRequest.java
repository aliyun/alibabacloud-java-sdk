// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class QueryMsgStatRequest extends TeaModel {
    @NameInMap("MsgId")
    public String msgId;

    public static QueryMsgStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgStatRequest self = new QueryMsgStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsgStatRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
