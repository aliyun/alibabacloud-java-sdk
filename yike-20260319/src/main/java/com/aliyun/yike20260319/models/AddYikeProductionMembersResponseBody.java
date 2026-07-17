// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class AddYikeProductionMembersResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the members were added successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static AddYikeProductionMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddYikeProductionMembersResponseBody self = new AddYikeProductionMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddYikeProductionMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddYikeProductionMembersResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
