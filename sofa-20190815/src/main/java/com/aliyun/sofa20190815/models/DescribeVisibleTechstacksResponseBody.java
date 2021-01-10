// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeVisibleTechstacksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Techstack")
    public java.util.List<DescribeVisibleTechstacksResponseBodyTechstack> techstack;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeVisibleTechstacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisibleTechstacksResponseBody self = new DescribeVisibleTechstacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVisibleTechstacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVisibleTechstacksResponseBody setTechstack(java.util.List<DescribeVisibleTechstacksResponseBodyTechstack> techstack) {
        this.techstack = techstack;
        return this;
    }
    public java.util.List<DescribeVisibleTechstacksResponseBodyTechstack> getTechstack() {
        return this.techstack;
    }

    public DescribeVisibleTechstacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeVisibleTechstacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeVisibleTechstacksResponseBodyTechstack extends TeaModel {
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

        public static DescribeVisibleTechstacksResponseBodyTechstack build(java.util.Map<String, ?> map) throws Exception {
            DescribeVisibleTechstacksResponseBodyTechstack self = new DescribeVisibleTechstacksResponseBodyTechstack();
            return TeaModel.build(map, self);
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVisibleTechstacksResponseBodyTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
