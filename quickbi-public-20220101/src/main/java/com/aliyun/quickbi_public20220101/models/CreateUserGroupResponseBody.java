// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36829379-0C38-5BC0-830A-92665BF77D4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the added user group is returned. An empty string \&quot;\&quot; is returned if the add fails.</p>
     * 
     * <strong>example:</strong>
     * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupResponseBody self = new CreateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserGroupResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
