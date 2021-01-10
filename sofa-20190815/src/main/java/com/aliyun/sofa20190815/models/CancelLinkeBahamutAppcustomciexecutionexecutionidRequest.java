// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutAppcustomciexecutionexecutionidRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static CancelLinkeBahamutAppcustomciexecutionexecutionidRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutAppcustomciexecutionexecutionidRequest self = new CancelLinkeBahamutAppcustomciexecutionexecutionidRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutAppcustomciexecutionexecutionidRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
