// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeAppResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setResult(DescribeAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppResponseBodyResultQuota extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("qps")
        public Integer qps;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("computeResource")
        public Integer computeResource;

        public static DescribeAppResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultQuota self = new DescribeAppResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeAppResponseBodyResultQuota setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeAppResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public DescribeAppResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

    }

    public static class DescribeAppResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        @NameInMap("type")
        public String type;

        @NameInMap("status")
        public String status;

        @NameInMap("schema")
        public java.util.Map<String, ?> schema;

        @NameInMap("progressPercent")
        public Integer progressPercent;

        @NameInMap("id")
        public String id;

        @NameInMap("algoDeploymentId")
        public Integer algoDeploymentId;

        @NameInMap("description")
        public String description;

        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        @NameInMap("quota")
        public DescribeAppResponseBodyResultQuota quota;

        public static DescribeAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResult self = new DescribeAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeAppResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAppResponseBodyResult setAutoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        public DescribeAppResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppResponseBodyResult setSchema(java.util.Map<String, ?> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.Map<String, ?> getSchema() {
            return this.schema;
        }

        public DescribeAppResponseBodyResult setProgressPercent(Integer progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        public DescribeAppResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppResponseBodyResult setAlgoDeploymentId(Integer algoDeploymentId) {
            this.algoDeploymentId = algoDeploymentId;
            return this;
        }
        public Integer getAlgoDeploymentId() {
            return this.algoDeploymentId;
        }

        public DescribeAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyResult setFetchFields(java.util.List<String> fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        public DescribeAppResponseBodyResult setQuota(DescribeAppResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAppResponseBodyResultQuota getQuota() {
            return this.quota;
        }

    }

}
