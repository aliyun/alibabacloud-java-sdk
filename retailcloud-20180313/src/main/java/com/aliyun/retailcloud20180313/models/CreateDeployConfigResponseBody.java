// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateDeployConfigResponseBodyResult result;

    public static CreateDeployConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployConfigResponseBody self = new CreateDeployConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeployConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateDeployConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateDeployConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeployConfigResponseBody setResult(CreateDeployConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDeployConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateDeployConfigResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SchemaId")
        public Long schemaId;

        public static CreateDeployConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDeployConfigResponseBodyResult self = new CreateDeployConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDeployConfigResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public CreateDeployConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDeployConfigResponseBodyResult setSchemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Long getSchemaId() {
            return this.schemaId;
        }

    }

}
