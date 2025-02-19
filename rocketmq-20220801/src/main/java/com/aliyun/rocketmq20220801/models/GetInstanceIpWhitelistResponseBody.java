// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhitelistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetInstanceIpWhitelistResponseBodyData data;

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
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0B962390-D84B-5D44-8C11-79DF40299D41</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetInstanceIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhitelistResponseBody self = new GetInstanceIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhitelistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceIpWhitelistResponseBody setData(GetInstanceIpWhitelistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceIpWhitelistResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceIpWhitelistResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetInstanceIpWhitelistResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetInstanceIpWhitelistResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceIpWhitelistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceIpWhitelistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceIpWhitelistResponseBodyData extends TeaModel {
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

        public static GetInstanceIpWhitelistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceIpWhitelistResponseBodyData self = new GetInstanceIpWhitelistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceIpWhitelistResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceIpWhitelistResponseBodyData setIpWhitelists(java.util.List<String> ipWhitelists) {
            this.ipWhitelists = ipWhitelists;
            return this;
        }
        public java.util.List<String> getIpWhitelists() {
            return this.ipWhitelists;
        }

        public GetInstanceIpWhitelistResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
