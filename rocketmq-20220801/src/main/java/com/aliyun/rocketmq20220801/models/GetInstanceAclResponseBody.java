// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAclResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetInstanceAclResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The authentication type of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>apache_acl: open source access control list (ACL)</li>
         * <li>default: the default account of the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apache_acl</p>
         */
        @NameInMap("aclType")
        public String aclType;

        /**
         * <p>The type of operations that can be performed on the resource.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The decision result of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The IP address whitelists.</p>
         */
        @NameInMap("ipWhitelists")
        public java.util.List<String> ipWhitelists;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The name of the resource on which the permissions are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The type of the resource on which the permissions are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The username.</p>
         * 
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
