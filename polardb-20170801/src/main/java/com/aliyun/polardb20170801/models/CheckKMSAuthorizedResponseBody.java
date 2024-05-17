// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckKMSAuthorizedResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cluster is authorized to use KMS. Valid values:</p>
     * <br>
     * <p>*   **0**: no.</p>
     * <p>*   **1**: yes.</p>
     */
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see [RAM role overview](https://help.aliyun.com/document_detail/93689.html).</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    public static CheckKMSAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckKMSAuthorizedResponseBody self = new CheckKMSAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckKMSAuthorizedResponseBody setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckKMSAuthorizedResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CheckKMSAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckKMSAuthorizedResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
