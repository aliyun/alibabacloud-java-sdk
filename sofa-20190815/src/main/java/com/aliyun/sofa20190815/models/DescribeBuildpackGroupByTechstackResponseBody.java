// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackGroupByTechstackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Count")
    public java.util.List<DescribeBuildpackGroupByTechstackResponseBodyCount> count;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeBuildpackGroupByTechstackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackGroupByTechstackResponseBody self = new DescribeBuildpackGroupByTechstackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackGroupByTechstackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackGroupByTechstackResponseBody setCount(java.util.List<DescribeBuildpackGroupByTechstackResponseBodyCount> count) {
        this.count = count;
        return this;
    }
    public java.util.List<DescribeBuildpackGroupByTechstackResponseBodyCount> getCount() {
        return this.count;
    }

    public DescribeBuildpackGroupByTechstackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackGroupByTechstackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeBuildpackGroupByTechstackResponseBodyCount extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Name")
        public String name;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("BuildpackCount")
        public Long buildpackCount;

        @NameInMap("Id")
        public String id;

        public static DescribeBuildpackGroupByTechstackResponseBodyCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackGroupByTechstackResponseBodyCount self = new DescribeBuildpackGroupByTechstackResponseBodyCount();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setBuildpackCount(Long buildpackCount) {
            this.buildpackCount = buildpackCount;
            return this;
        }
        public Long getBuildpackCount() {
            return this.buildpackCount;
        }

        public DescribeBuildpackGroupByTechstackResponseBodyCount setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
