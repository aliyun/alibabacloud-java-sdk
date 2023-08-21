// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteInvalidCloudAccountRecordRequest extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    public static DeleteInvalidCloudAccountRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidCloudAccountRecordRequest self = new DeleteInvalidCloudAccountRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidCloudAccountRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
