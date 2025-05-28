// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B6141A5A-A9EF-5F16-BF34-EFB9C1CCE4F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of adding members to a user group is returned. Valid values:</p>
     * <ul>
     * <li>true: The task is added.</li>
     * <li>false: The tag failed to be added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

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

    public static AddUserGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberResponseBody self = new AddUserGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserGroupMemberResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public AddUserGroupMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
