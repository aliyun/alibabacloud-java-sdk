// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefuseApplicantRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    public static RefuseApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseApplicantRequest self = new RefuseApplicantRequest();
        return TeaModel.build(map, self);
    }

    public RefuseApplicantRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefuseApplicantRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
