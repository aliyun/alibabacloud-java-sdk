// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAclResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetInstanceAclResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetInstanceAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAclResponseBody self = new GetInstanceAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceAclResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceAclResponseBody setData(GetInstanceAclResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceAclResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceAclResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetInstanceAclResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetInstanceAclResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceAclResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceAclResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceAclResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>apache_acl</p>
         */
        @NameInMap("aclType")
        public String aclType;

        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("ipWhitelists")
        public java.util.List<String> ipWhitelists;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("username")
        public String username;

        public static GetInstanceAclResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceAclResponseBodyData self = new GetInstanceAclResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceAclResponseBodyData setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetInstanceAclResponseBodyData setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetInstanceAclResponseBodyData setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public GetInstanceAclResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceAclResponseBodyData setIpWhitelists(java.util.List<String> ipWhitelists) {
            this.ipWhitelists = ipWhitelists;
            return this;
        }
        public java.util.List<String> getIpWhitelists() {
            return this.ipWhitelists;
        }

        public GetInstanceAclResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceAclResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetInstanceAclResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetInstanceAclResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
