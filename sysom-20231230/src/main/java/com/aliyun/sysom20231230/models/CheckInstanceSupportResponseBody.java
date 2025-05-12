// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<CheckInstanceSupportResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CheckInstanceSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportResponseBody self = new CheckInstanceSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckInstanceSupportResponseBody setData(java.util.List<CheckInstanceSupportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckInstanceSupportResponseBodyData> getData() {
        return this.data;
    }

    public CheckInstanceSupportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckInstanceSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckInstanceSupportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <strong>example:</strong>
         * <p>instance not found in ecs</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("support")
        public Boolean support;

        public static CheckInstanceSupportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckInstanceSupportResponseBodyData self = new CheckInstanceSupportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckInstanceSupportResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public CheckInstanceSupportResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CheckInstanceSupportResponseBodyData setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

}
