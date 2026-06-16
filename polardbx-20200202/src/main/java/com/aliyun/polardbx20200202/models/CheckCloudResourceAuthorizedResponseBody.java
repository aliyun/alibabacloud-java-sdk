// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Data")
    public CheckCloudResourceAuthorizedResponseBodyData data;

    /**
     * <p>The request ID.</p>
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

    public CheckCloudResourceAuthorizedResponseBody setData(CheckCloudResourceAuthorizedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckCloudResourceAuthorizedResponseBodyData getData() {
        return this.data;
    }

    public CheckCloudResourceAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckCloudResourceAuthorizedResponseBodyData extends TeaModel {
        /**
         * <p>The authorization status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not authorized.</li>
         * <li><strong>1</strong>: authorized.</li>
         * <li><strong>2</strong>: KMS is not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthorizationState")
        public String authorizationState;

        /**
         * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the authorized role. After the authorization of this role is complete, the related KMS can be used. Format: acs:ram::$accountID:role/$roleName.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static CheckCloudResourceAuthorizedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckCloudResourceAuthorizedResponseBodyData self = new CheckCloudResourceAuthorizedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckCloudResourceAuthorizedResponseBodyData setAuthorizationState(String authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }
        public String getAuthorizationState() {
            return this.authorizationState;
        }

        public CheckCloudResourceAuthorizedResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

}
