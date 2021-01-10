// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFirstRankResponseBody extends TeaModel {
    @NameInMap("result")
    public CreateFirstRankResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static CreateFirstRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirstRankResponseBody self = new CreateFirstRankResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirstRankResponseBody setResult(CreateFirstRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFirstRankResponseBodyResult getResult() {
        return this.result;
    }

    public CreateFirstRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFirstRankResponseBodyResultMeta extends TeaModel {
        @NameInMap("arg")
        public String arg;

        @NameInMap("attribute")
        public String attribute;

        @NameInMap("weight")
        public Float weight;

        public static CreateFirstRankResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateFirstRankResponseBodyResultMeta self = new CreateFirstRankResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public CreateFirstRankResponseBodyResultMeta setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateFirstRankResponseBodyResultMeta setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public CreateFirstRankResponseBodyResultMeta setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

    public static class CreateFirstRankResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("name")
        public String name;

        @NameInMap("meta")
        public java.util.List<CreateFirstRankResponseBodyResultMeta> meta;

        public static CreateFirstRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFirstRankResponseBodyResult self = new CreateFirstRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFirstRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateFirstRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFirstRankResponseBodyResult setMeta(java.util.List<CreateFirstRankResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<CreateFirstRankResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

    }

}
