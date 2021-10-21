// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class WriteCommunicationLogRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    @NameInMap("TargetId")
    public String targetId;

    public static WriteCommunicationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteCommunicationLogRequest self = new WriteCommunicationLogRequest();
        return TeaModel.build(map, self);
    }

    public WriteCommunicationLogRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public WriteCommunicationLogRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public WriteCommunicationLogRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
