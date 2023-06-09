// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeFirstRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the rough sort expression.</p>
     */
    @NameInMap("result")
    public DescribeFirstRankResponseBodyResult result;

    public static DescribeFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirstRankResponseBody self = new DescribeFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirstRankResponseBody setResult(DescribeFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeFirstRankResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The parameters that are used by a function in the expression.</p>
         */
        @NameInMap("arg")
        public String arg;

        /**
         * <p>The attribute, feature function, or field to be searched for.</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <p>The weight.</p>
         * <br>
         * <p>Valid values: \[-100000,100000] (excluding 0).</p>
         */
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
        /**
         * <p>Indicates whether the expression is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The description of the expression.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The content of the expression.</p>
         */
        @NameInMap("meta")
        public java.util.List<DescribeFirstRankResponseBodyResultMeta> meta;

        /**
         * <p>The name of the expression.</p>
         */
        @NameInMap("name")
        public String name;

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

        public DescribeFirstRankResponseBodyResult setMeta(java.util.List<DescribeFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

        public DescribeFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
