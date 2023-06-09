// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each query analysis rule.</p>
     * <br>
     * <p>For more information, see [QueryProcessor](~~170014~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListQueryProcessorsResponseBodyResult> result;

    public static ListQueryProcessorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorsResponseBody self = new ListQueryProcessorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryProcessorsResponseBody setResult(java.util.List<ListQueryProcessorsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListQueryProcessorsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListQueryProcessorsResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the query analysis rule is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the query analysis rule was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of the industry. Valid values:</p>
         * <br>
         * <p>*   GENERAL</p>
         * <p>*   ECOMMERCE</p>
         * <p>*   IT_CONTENT</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The indexes to which the query analysis rule applies.</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The name of the query analysis rule.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The features that are used in the query analysis rule.</p>
         * <br>
         * <p>For more information, see the ["Processor"](~~170014~~) section of the QueryProcessor topic.</p>
         */
        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        /**
         * <p>The time when the query analysis rule was last updated.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListQueryProcessorsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListQueryProcessorsResponseBodyResult self = new ListQueryProcessorsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListQueryProcessorsResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListQueryProcessorsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListQueryProcessorsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListQueryProcessorsResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public ListQueryProcessorsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQueryProcessorsResponseBodyResult setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public ListQueryProcessorsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
