// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveFirstRankResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E676FAB6-A0AC-64D9-F9D7-D0D33C930CFF</p>
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
         * <p>The parameters that are used by a function in the expression. For more information, see Rough sort functions.<a href="~~170007~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("arg")
        public String arg;

        /**
         * <p>The attribute, which refers to the scoring feature or search field, For more information about supported feature functions, see Rough sort functions.<a href="~~170007~~"></a></p>
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
         * <p>10</p>
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
         * <p>Specifies whether to set the fine sort expression as the default sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("active")
        public Boolean active;

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
         */
        @NameInMap("meta")
        public java.util.List<RemoveFirstRankResponseBodyResultMeta> meta;

        /**
         * <p>Parameter</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
