// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the query analysis rule.</p>
     */
    @NameInMap("result")
    public ModifyQueryProcessorResponseBodyResult result;

    public static ModifyQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQueryProcessorResponseBody self = new ModifyQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyQueryProcessorResponseBody setResult(ModifyQueryProcessorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyQueryProcessorResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyQueryProcessorResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the query analysis rule is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the rule was created.</p>
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
         * <p>The analysis rule.</p>
         */
        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        /**
         * <p>The most recent update time.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ModifyQueryProcessorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyQueryProcessorResponseBodyResult self = new ModifyQueryProcessorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyQueryProcessorResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ModifyQueryProcessorResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifyQueryProcessorResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyQueryProcessorResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public ModifyQueryProcessorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyQueryProcessorResponseBodyResult setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public ModifyQueryProcessorResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
