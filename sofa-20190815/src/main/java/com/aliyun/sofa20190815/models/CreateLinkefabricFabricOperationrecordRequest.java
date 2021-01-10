// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkefabricFabricOperationrecordRequest extends TeaModel {
    @NameInMap("OperationRecordContext")
    public String operationRecordContext;

    @NameInMap("OperationRecordVoListRepeatList")
    public java.util.List<String> operationRecordVoListRepeatList;

    public static CreateLinkefabricFabricOperationrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkefabricFabricOperationrecordRequest self = new CreateLinkefabricFabricOperationrecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkefabricFabricOperationrecordRequest setOperationRecordContext(String operationRecordContext) {
        this.operationRecordContext = operationRecordContext;
        return this;
    }
    public String getOperationRecordContext() {
        return this.operationRecordContext;
    }

    public CreateLinkefabricFabricOperationrecordRequest setOperationRecordVoListRepeatList(java.util.List<String> operationRecordVoListRepeatList) {
        this.operationRecordVoListRepeatList = operationRecordVoListRepeatList;
        return this;
    }
    public java.util.List<String> getOperationRecordVoListRepeatList() {
        return this.operationRecordVoListRepeatList;
    }

}
