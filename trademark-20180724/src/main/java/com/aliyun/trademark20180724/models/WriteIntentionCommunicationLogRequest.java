// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class WriteIntentionCommunicationLogRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    @NameInMap("Reject")
    public Boolean reject;

    public static WriteIntentionCommunicationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteIntentionCommunicationLogRequest self = new WriteIntentionCommunicationLogRequest();
        return TeaModel.build(map, self);
    }

    public WriteIntentionCommunicationLogRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public WriteIntentionCommunicationLogRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public WriteIntentionCommunicationLogRequest setReject(Boolean reject) {
        this.reject = reject;
        return this;
    }
    public Boolean getReject() {
        return this.reject;
    }

}
