// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static CreateChangeSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetResponseBody self = new CreateChangeSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public CreateChangeSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChangeSetResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
