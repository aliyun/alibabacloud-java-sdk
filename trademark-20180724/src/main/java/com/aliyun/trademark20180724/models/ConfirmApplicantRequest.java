// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmApplicantRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    public static ConfirmApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmApplicantRequest self = new ConfirmApplicantRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmApplicantRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ConfirmApplicantRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
