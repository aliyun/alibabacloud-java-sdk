// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetResponse extends TeaModel {
    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    public static CreateChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetResponse self = new CreateChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetResponse setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public CreateChangeSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChangeSetResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
