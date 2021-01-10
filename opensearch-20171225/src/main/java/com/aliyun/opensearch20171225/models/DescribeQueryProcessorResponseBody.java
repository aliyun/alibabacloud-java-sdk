// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeQueryProcessorResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeQueryProcessorResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryProcessorResponseBody self = new DescribeQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryProcessorResponseBody setResult(DescribeQueryProcessorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeQueryProcessorResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQueryProcessorResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("active")
        public Boolean active;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        public static DescribeQueryProcessorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeQueryProcessorResponseBodyResult self = new DescribeQueryProcessorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeQueryProcessorResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeQueryProcessorResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeQueryProcessorResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeQueryProcessorResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public DescribeQueryProcessorResponseBodyResult setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public DescribeQueryProcessorResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public DescribeQueryProcessorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
