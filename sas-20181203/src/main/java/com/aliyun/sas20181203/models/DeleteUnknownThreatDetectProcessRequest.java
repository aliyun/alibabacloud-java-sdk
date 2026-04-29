// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectProcessRequest extends TeaModel {
    @NameInMap("ProcessIdList")
    public java.util.List<String> processIdList;

    public static DeleteUnknownThreatDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectProcessRequest self = new DeleteUnknownThreatDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectProcessRequest setProcessIdList(java.util.List<String> processIdList) {
        this.processIdList = processIdList;
        return this;
    }
    public java.util.List<String> getProcessIdList() {
        return this.processIdList;
    }

}
