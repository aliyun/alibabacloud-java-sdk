// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RejectExpertSolutionRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    public static RejectExpertSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectExpertSolutionRequest self = new RejectExpertSolutionRequest();
        return TeaModel.build(map, self);
    }

    public RejectExpertSolutionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RejectExpertSolutionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
