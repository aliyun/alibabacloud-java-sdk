// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the instance is authorized to use KMS. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The instance is authorized to use KMS.</li>
     * <li><strong>1</strong>: The instance is not authorized to use KMS.</li>
     * <li><strong>2</strong>: KMS is not activated. For more information, see <a href="https://help.aliyun.com/document_detail/153781.html">Activate KMS</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCloudResourceAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponseBody self = new CheckCloudResourceAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponseBody setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckCloudResourceAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
