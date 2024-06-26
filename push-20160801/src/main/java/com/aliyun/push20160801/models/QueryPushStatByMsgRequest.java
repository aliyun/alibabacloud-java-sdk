// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByMsgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>510427</p>
     */
    @NameInMap("MessageId")
    public Long messageId;

    public static QueryPushStatByMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByMsgRequest self = new QueryPushStatByMsgRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByMsgRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryPushStatByMsgRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

}
