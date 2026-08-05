// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not permitted to operate this instance. User=206770505484719639, Instance=null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The number of concurrent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1769653616000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a large model robot</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e49ad122-15a1-443a-a102-84a78a93be79</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Questionnaire</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Xiaomi business space information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentId&quot;:&quot;1380415&quot;,&quot;agentInstanceId&quot;:&quot;outbound_d1d1a8e6-a14e-46c8-b580-e50d94cb2d7e&quot;,&quot;agentKey&quot;:&quot;329cb6fdb880431d82400a8365380100_p_outbound_public&quot;}</p>
         */
        @NameInMap("NluProfile")
        public String nluProfile;

        /**
         * <p>The service mode.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("ServiceMode")
        public String serviceMode;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1308144684576765</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1769653616000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetInstanceResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceResponseBodyData setNluProfile(String nluProfile) {
            this.nluProfile = nluProfile;
            return this;
        }
        public String getNluProfile() {
            return this.nluProfile;
        }

        public GetInstanceResponseBodyData setServiceMode(String serviceMode) {
            this.serviceMode = serviceMode;
            return this;
        }
        public String getServiceMode() {
            return this.serviceMode;
        }

        public GetInstanceResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetInstanceResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
