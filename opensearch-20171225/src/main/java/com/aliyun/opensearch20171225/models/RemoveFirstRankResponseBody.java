// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveFirstRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the rough sort expression.</p>
     */
    @NameInMap("result")
    public RemoveFirstRankResponseBodyResult result;

    public static RemoveFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveFirstRankResponseBody self = new RemoveFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveFirstRankResponseBody setResult(RemoveFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RemoveFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public static class RemoveFirstRankResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The parameters that are used by a function in the expression.</p>
         * <br>
         * <p>For more information, see Rough sort functions.</p>
         */
        @NameInMap("arg")
        public String arg;

        /**
         * <p>The attribute, feature function, or field to be searched for.</p>
         * <br>
         * <p>For more information about supported feature functions, see Rough sort functions.</p>
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

        public static RemoveFirstRankResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            RemoveFirstRankResponseBodyResultMeta self = new RemoveFirstRankResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public RemoveFirstRankResponseBodyResultMeta setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public RemoveFirstRankResponseBodyResultMeta setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public RemoveFirstRankResponseBodyResultMeta setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

    public static class RemoveFirstRankResponseBodyResult extends TeaModel {
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
        public java.util.List<RemoveFirstRankResponseBodyResultMeta> meta;

        /**
         * <p>The name of the expression.</p>
         */
        @NameInMap("name")
        public String name;

        public static RemoveFirstRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveFirstRankResponseBodyResult self = new RemoveFirstRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RemoveFirstRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public RemoveFirstRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RemoveFirstRankResponseBodyResult setMeta(java.util.List<RemoveFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<RemoveFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

        public RemoveFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
