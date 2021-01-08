// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateEnterpriseResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateEnterpriseResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseResponseBody self = new CreateEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEnterpriseResponseBody setData(CreateEnterpriseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnterpriseResponseBodyData getData() {
        return this.data;
    }

    public CreateEnterpriseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnterpriseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEnterpriseResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("ProhibitCode")
        public Integer prohibitCode;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateEnterpriseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseResponseBodyData self = new CreateEnterpriseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateEnterpriseResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateEnterpriseResponseBodyData setProhibitCode(Integer prohibitCode) {
            this.prohibitCode = prohibitCode;
            return this;
        }
        public Integer getProhibitCode() {
            return this.prohibitCode;
        }

        public CreateEnterpriseResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateEnterpriseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEnterpriseResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
