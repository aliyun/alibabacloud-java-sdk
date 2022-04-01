// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateStackApplicationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateStackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackApplicationResponseBody self = new CreateStackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStackApplicationResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public CreateStackApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplicationSpec extends TeaModel {
        @NameInMap("iaasType")
        public String iaasType;

        @NameInMap("name")
        public String name;

        @NameInMap("version")
        public String version;

        public static ApplicationSpec build(java.util.Map<String, ?> map) throws Exception {
            ApplicationSpec self = new ApplicationSpec();
            return TeaModel.build(map, self);
        }

        public ApplicationSpec setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public ApplicationSpec setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApplicationSpec setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("applicationSpec")
        public ApplicationSpec applicationSpec;

        @NameInMap("createTime")
        public Long createTime;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setApplicationSpec(ApplicationSpec applicationSpec) {
            this.applicationSpec = applicationSpec;
            return this;
        }
        public ApplicationSpec getApplicationSpec() {
            return this.applicationSpec;
        }

        public Data setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
