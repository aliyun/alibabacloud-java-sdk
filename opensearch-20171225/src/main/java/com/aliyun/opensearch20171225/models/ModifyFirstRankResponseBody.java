// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyFirstRankResponseBody extends TeaModel {
    @NameInMap("result")
    public ModifyFirstRankResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static ModifyFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirstRankResponseBody self = new ModifyFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFirstRankResponseBody setResult(ModifyFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public ModifyFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyFirstRankResponseBodyResultMeta extends TeaModel {
        @NameInMap("arg")
        public String arg;

        @NameInMap("attribute")
        public String attribute;

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
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("meta")
        public java.util.List<ModifyFirstRankResponseBodyResultMeta> meta;

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

        public ModifyFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyFirstRankResponseBodyResult setMeta(java.util.List<ModifyFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<ModifyFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

    }

}
