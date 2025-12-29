// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFirstRanksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the rough sort expression.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/170007.html">FirstRank</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
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
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/180765.html">Rough sort functions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("arg")
        public String arg;

        /**
         * <p>The attribute, feature function, or field to be searched for.</p>
         * <p>For more information about supported feature functions, see <a href="https://help.aliyun.com/document_detail/180765.html">Rough sort functions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>static_bm25()</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <p>The weight. Valid values: -100000 to 100000. The value cannot be 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Specifies whether to set the fine sort expression as the default sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the expression was created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The information about the expression.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("meta")
        public java.util.List<ListFirstRanksResponseBodyResultMeta> meta;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time when the expression was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
