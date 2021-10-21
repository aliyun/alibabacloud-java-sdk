// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RejectApplicantRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Note")
    public String note;

    public static RejectApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectApplicantRequest self = new RejectApplicantRequest();
        return TeaModel.build(map, self);
    }

    public RejectApplicantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectApplicantRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
