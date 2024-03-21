// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ConfirmExpertSolutionRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    public static ConfirmExpertSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmExpertSolutionRequest self = new ConfirmExpertSolutionRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmExpertSolutionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ConfirmExpertSolutionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
