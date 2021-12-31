// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFirstRanksResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListFirstRanksResponseBodyResult> result;

    public static ListFirstRanksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFirstRanksResponseBody self = new ListFirstRanksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFirstRanksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFirstRanksResponseBody setResult(java.util.List<ListFirstRanksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFirstRanksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListFirstRanksResponseBodyResultMeta extends TeaModel {
        @NameInMap("arg")
        public String arg;

        @NameInMap("attribute")
        public String attribute;

        @NameInMap("weight")
        public Integer weight;

        public static ListFirstRanksResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListFirstRanksResponseBodyResultMeta self = new ListFirstRanksResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListFirstRanksResponseBodyResultMeta setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ListFirstRanksResponseBodyResultMeta setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ListFirstRanksResponseBodyResultMeta setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListFirstRanksResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public java.util.List<ListFirstRanksResponseBodyResultMeta> meta;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        public static ListFirstRanksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFirstRanksResponseBodyResult self = new ListFirstRanksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFirstRanksResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListFirstRanksResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListFirstRanksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFirstRanksResponseBodyResult setMeta(java.util.List<ListFirstRanksResponseBodyResultMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<ListFirstRanksResponseBodyResultMeta> getMeta() {
            return this.meta;
        }

        public ListFirstRanksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFirstRanksResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
