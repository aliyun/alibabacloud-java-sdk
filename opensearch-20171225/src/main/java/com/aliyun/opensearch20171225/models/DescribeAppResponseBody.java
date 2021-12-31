// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeAppResponseBodyResult result;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppResponseBody setResult(DescribeAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppResponseBodyResultDomainFunctions extends TeaModel {
        @NameInMap("algo")
        public java.util.List<String> algo;

        @NameInMap("qp")
        public java.util.List<String> qp;

        @NameInMap("service")
        public java.util.List<String> service;

        public static DescribeAppResponseBodyResultDomainFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultDomainFunctions self = new DescribeAppResponseBodyResultDomainFunctions();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultDomainFunctions setAlgo(java.util.List<String> algo) {
            this.algo = algo;
            return this;
        }
        public java.util.List<String> getAlgo() {
            return this.algo;
        }

        public DescribeAppResponseBodyResultDomainFunctions setQp(java.util.List<String> qp) {
            this.qp = qp;
            return this;
        }
        public java.util.List<String> getQp() {
            return this.qp;
        }

        public DescribeAppResponseBodyResultDomainFunctions setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class DescribeAppResponseBodyResultDomain extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("functions")
        public DescribeAppResponseBodyResultDomainFunctions functions;

        @NameInMap("name")
        public String name;

        public static DescribeAppResponseBodyResultDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultDomain self = new DescribeAppResponseBodyResultDomain();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultDomain setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAppResponseBodyResultDomain setFunctions(DescribeAppResponseBodyResultDomainFunctions functions) {
            this.functions = functions;
            return this;
        }
        public DescribeAppResponseBodyResultDomainFunctions getFunctions() {
            return this.functions;
        }

        public DescribeAppResponseBodyResultDomain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppResponseBodyResultQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("qps")
        public Integer qps;

        @NameInMap("spec")
        public String spec;

        public static DescribeAppResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultQuota self = new DescribeAppResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public DescribeAppResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public DescribeAppResponseBodyResultQuota setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeAppResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeAppResponseBodyResult extends TeaModel {
        @NameInMap("algoDeploymentId")
        public Integer algoDeploymentId;

        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("created")
        public Integer created;

        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public DescribeAppResponseBodyResultDomain domain;

        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        @NameInMap("id")
        public String id;

        @NameInMap("progressPercent")
        public Integer progressPercent;

        @NameInMap("quota")
        public DescribeAppResponseBodyResultQuota quota;

        @NameInMap("schema")
        public java.util.Map<String, ?> schema;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        public static DescribeAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResult self = new DescribeAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResult setAlgoDeploymentId(Integer algoDeploymentId) {
            this.algoDeploymentId = algoDeploymentId;
            return this;
        }
        public Integer getAlgoDeploymentId() {
            return this.algoDeploymentId;
        }

        public DescribeAppResponseBodyResult setAutoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        public DescribeAppResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAppResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyResult setDomain(DescribeAppResponseBodyResultDomain domain) {
            this.domain = domain;
            return this;
        }
        public DescribeAppResponseBodyResultDomain getDomain() {
            return this.domain;
        }

        public DescribeAppResponseBodyResult setFetchFields(java.util.List<String> fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        public DescribeAppResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppResponseBodyResult setProgressPercent(Integer progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        public DescribeAppResponseBodyResult setQuota(DescribeAppResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAppResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public DescribeAppResponseBodyResult setSchema(java.util.Map<String, ?> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.Map<String, ?> getSchema() {
            return this.schema;
        }

        public DescribeAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
