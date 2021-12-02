// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppResourceAllocResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAppResourceAllocResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAppResourceAllocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResourceAllocResponseBody self = new CreateAppResourceAllocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResourceAllocResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAppResourceAllocResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateAppResourceAllocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResourceAllocResponseBody setResult(CreateAppResourceAllocResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppResourceAllocResponseBodyResult getResult() {
        return this.result;
    }

    public CreateAppResourceAllocResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAppResourceAllocResponseBodyResult extends TeaModel {
        @NameInMap("AppEnvId")
        public Long appEnvId;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceDef")
        public String resourceDef;

        public static CreateAppResourceAllocResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResourceAllocResponseBodyResult self = new CreateAppResourceAllocResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResourceAllocResponseBodyResult setAppEnvId(Long appEnvId) {
            this.appEnvId = appEnvId;
            return this;
        }
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        public CreateAppResourceAllocResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public CreateAppResourceAllocResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateAppResourceAllocResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateAppResourceAllocResponseBodyResult setResourceDef(String resourceDef) {
            this.resourceDef = resourceDef;
            return this;
        }
        public String getResourceDef() {
            return this.resourceDef;
        }

    }

}
