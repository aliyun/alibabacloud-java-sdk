// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWritableTechstacksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Techstack")
    public java.util.List<DescribeWritableTechstacksResponseBodyTechstack> techstack;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeWritableTechstacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWritableTechstacksResponseBody self = new DescribeWritableTechstacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWritableTechstacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWritableTechstacksResponseBody setTechstack(java.util.List<DescribeWritableTechstacksResponseBodyTechstack> techstack) {
        this.techstack = techstack;
        return this;
    }
    public java.util.List<DescribeWritableTechstacksResponseBodyTechstack> getTechstack() {
        return this.techstack;
    }

    public DescribeWritableTechstacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeWritableTechstacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeWritableTechstacksResponseBodyTechstack extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeWritableTechstacksResponseBodyTechstack build(java.util.Map<String, ?> map) throws Exception {
            DescribeWritableTechstacksResponseBodyTechstack self = new DescribeWritableTechstacksResponseBodyTechstack();
            return TeaModel.build(map, self);
        }

        public DescribeWritableTechstacksResponseBodyTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWritableTechstacksResponseBodyTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
