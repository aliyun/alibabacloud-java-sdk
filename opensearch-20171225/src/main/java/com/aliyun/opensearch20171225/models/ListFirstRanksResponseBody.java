// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFirstRanksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each rough sort expression.</p>
     * <br>
     * <p>For more information, see [FirstRank](~~170007~~).</p>
     */
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
        /**
         * <p>The parameters that are used by a function in the expression.</p>
         * <br>
         * <p>For more information, see [Rough sort functions](~~180765~~).</p>
         */
        @NameInMap("arg")
        public String arg;

        /**
         * <p>The attribute, feature function, or field to be searched for.</p>
         * <br>
         * <p>For more information about supported feature functions, see [Rough sort functions](~~180765~~).</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <p>The weight.</p>
         * <br>
         * <p>Valid values: \[-100000,100000] (excluding 0).</p>
         */
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
        /**
         * <p>Indicates whether the expression is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        /**
         * <p>The description of the expression.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The content of the expression.</p>
         */
        @NameInMap("meta")
        public java.util.List<ListFirstRanksResponseBodyResultMeta> meta;

        /**
         * <p>The name of the expression.</p>
         */
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
