// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;InstanceId\&quot;: \&quot;ob369xifpi2074\&quot;, \&quot;AutoUpgradeObVersion\&quot;: False}</p>
     */
    @NameInMap("Instance")
    public ModifyInstanceResponseBodyInstance instance;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponseBody self = new ModifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyInstanceResponseBody setInstance(ModifyInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public ModifyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyInstanceResponseBodyInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1578469042851</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <strong>example:</strong>
         * <p>90515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConcurrentConversation")
        public Integer maxConcurrentConversation;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        public static ModifyInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceResponseBodyInstance self = new ModifyInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceResponseBodyInstance setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ModifyInstanceResponseBodyInstance setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ModifyInstanceResponseBodyInstance setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ModifyInstanceResponseBodyInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ModifyInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyInstanceResponseBodyInstance setMaxConcurrentConversation(Integer maxConcurrentConversation) {
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }
        public Integer getMaxConcurrentConversation() {
            return this.maxConcurrentConversation;
        }

        public ModifyInstanceResponseBodyInstance setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

    }

}
