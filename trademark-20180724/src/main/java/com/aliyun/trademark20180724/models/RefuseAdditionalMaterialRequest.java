// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefuseAdditionalMaterialRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Note")
    public String note;

    public static RefuseAdditionalMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseAdditionalMaterialRequest self = new RefuseAdditionalMaterialRequest();
        return TeaModel.build(map, self);
    }

    public RefuseAdditionalMaterialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefuseAdditionalMaterialRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
