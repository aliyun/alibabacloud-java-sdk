// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the query analysis rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
         * <p>Indicates whether the query analysis rule is a default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of the industry to which the query analysis rule is applied. Valid values:</p>
         * <ul>
         * <li>GENERAL</li>
         * <li>ECOMMERCE</li>
         * <li>IT_CONTENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The indexes to which the query analysis rule is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;default&quot;]</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The name of the query analysis rule.</p>
         * 
         * <strong>example:</strong>
         * <p>synonym</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The analysis rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        /**
         * <p>The time when the rule was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
