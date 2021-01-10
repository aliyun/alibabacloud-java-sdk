// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutAppcustomciexecutionexecutionidRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static RetryLinkeBahamutAppcustomciexecutionexecutionidRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutAppcustomciexecutionexecutionidRequest self = new RetryLinkeBahamutAppcustomciexecutionexecutionidRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutAppcustomciexecutionexecutionidRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
