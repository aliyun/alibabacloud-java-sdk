// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyFirstRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the rough sort expression.</p>
     */
    @NameInMap("result")
    public ModifyFirstRankResponseBodyResult result;

    public static ModifyFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirstRankResponseBody self = new ModifyFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFirstRankResponseBody setResult(ModifyFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyFirstRankResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The parameters that are used by a function in the expression.</p>
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

        public static ModifyFirstRankResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyFirstRankResponseBodyResultMeta self = new ModifyFirstRankResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyFirstRankResponseBodyResultMeta setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyFirstRankResponseBodyResultMeta setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ModifyFirstRankResponseBodyResultMeta setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

    public static class ModifyFirstRankResponseBodyResult extends TeaModel {
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
        public java.util.List<ModifyFirstRankResponseBodyResultMeta> meta;

        /**
         * <p>The name of the expression.</p>
         */
        @NameInMap("name")
        public String name;

        public static ModifyFirstRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyFirstRankResponseBodyResult self = new ModifyFirstRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyFirstRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ModifyFirstRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyFirstRankResponseBodyResult setMeta(java.util.List<ModifyFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<ModifyFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

        public ModifyFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
