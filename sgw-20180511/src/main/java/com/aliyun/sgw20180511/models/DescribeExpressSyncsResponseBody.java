// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExpressSyncs")
    public DescribeExpressSyncsResponseBodyExpressSyncs expressSyncs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpressSyncsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncsResponseBody self = new DescribeExpressSyncsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressSyncsResponseBody setExpressSyncs(DescribeExpressSyncsResponseBodyExpressSyncs expressSyncs) {
        this.expressSyncs = expressSyncs;
        return this;
    }
    public DescribeExpressSyncsResponseBodyExpressSyncs getExpressSyncs() {
        return this.expressSyncs;
    }

    public DescribeExpressSyncsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressSyncsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressSyncsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExpressSyncsResponseBodyExpressSyncsExpressSync extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("BucketPrefix")
        public String bucketPrefix;

        @NameInMap("BucketRegion")
        public String bucketRegion;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpressSyncId")
        public String expressSyncId;

        @NameInMap("MnsTopic")
        public String mnsTopic;

        @NameInMap("Name")
        public String name;

        public static DescribeExpressSyncsResponseBodyExpressSyncsExpressSync build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressSyncsResponseBodyExpressSyncsExpressSync self = new DescribeExpressSyncsResponseBodyExpressSyncsExpressSync();
            return TeaModel.build(map, self);
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setBucketPrefix(String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public String getBucketPrefix() {
            return this.bucketPrefix;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setBucketRegion(String bucketRegion) {
            this.bucketRegion = bucketRegion;
            return this;
        }
        public String getBucketRegion() {
            return this.bucketRegion;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setExpressSyncId(String expressSyncId) {
            this.expressSyncId = expressSyncId;
            return this;
        }
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setMnsTopic(String mnsTopic) {
            this.mnsTopic = mnsTopic;
            return this;
        }
        public String getMnsTopic() {
            return this.mnsTopic;
        }

        public DescribeExpressSyncsResponseBodyExpressSyncsExpressSync setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeExpressSyncsResponseBodyExpressSyncs extends TeaModel {
        @NameInMap("ExpressSync")
        public java.util.List<DescribeExpressSyncsResponseBodyExpressSyncsExpressSync> expressSync;

        public static DescribeExpressSyncsResponseBodyExpressSyncs build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressSyncsResponseBodyExpressSyncs self = new DescribeExpressSyncsResponseBodyExpressSyncs();
            return TeaModel.build(map, self);
        }

        public DescribeExpressSyncsResponseBodyExpressSyncs setExpressSync(java.util.List<DescribeExpressSyncsResponseBodyExpressSyncsExpressSync> expressSync) {
            this.expressSync = expressSync;
            return this;
        }
        public java.util.List<DescribeExpressSyncsResponseBodyExpressSyncsExpressSync> getExpressSync() {
            return this.expressSync;
        }

    }

}
