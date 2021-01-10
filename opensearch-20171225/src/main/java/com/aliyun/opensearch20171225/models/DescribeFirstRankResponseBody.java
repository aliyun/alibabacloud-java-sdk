// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeFirstRankResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeFirstRankResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirstRankResponseBody self = new DescribeFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirstRankResponseBody setResult(DescribeFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFirstRankResponseBodyResultMeta extends TeaModel {
        @NameInMap("arg")
        public String arg;

        @NameInMap("attribute")
        public String attribute;

        @NameInMap("weight")
        public Float weight;

        public static DescribeFirstRankResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstRankResponseBodyResultMeta self = new DescribeFirstRankResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public DescribeFirstRankResponseBodyResultMeta setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public DescribeFirstRankResponseBodyResultMeta setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeFirstRankResponseBodyResultMeta setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

    public static class DescribeFirstRankResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("meta")
        public java.util.List<DescribeFirstRankResponseBodyResultMeta> meta;

        public static DescribeFirstRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstRankResponseBodyResult self = new DescribeFirstRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFirstRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeFirstRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFirstRankResponseBodyResult setMeta(java.util.List<DescribeFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

    }

}
