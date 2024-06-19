// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckCloudResourceAuthorizedResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthorizationState")
        public String authorizationState;

        /**
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
