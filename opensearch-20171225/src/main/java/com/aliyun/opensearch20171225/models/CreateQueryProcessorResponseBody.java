// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateQueryProcessorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the query analysis rule.</p>
     */
    @NameInMap("result")
    public CreateQueryProcessorResponseBodyResult result;

    public static CreateQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryProcessorResponseBody self = new CreateQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQueryProcessorResponseBody setResult(CreateQueryProcessorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateQueryProcessorResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateQueryProcessorResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the query analysis rule is the default one.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the query analysis rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1587398402</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of the industry to which the query analysis rule was applied. Valid values:</p>
         * <ul>
         * <li>GENERAL: general.</li>
         * <li>ECOMMERCE: e-commerce.</li>
         * <li>IT_CONTENT: IT content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The indexes to which the query analysis rule was applied.</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The name of the query analysis rule.</p>
         * 
         * <strong>example:</strong>
         * <p>query_filter</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The features that are used in the query analysis rule.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/170014.html">QueryProcessor</a>.</p>
         */
        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        /**
         * <p>The time when the query analysis rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1587398402</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static CreateQueryProcessorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateQueryProcessorResponseBodyResult self = new CreateQueryProcessorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateQueryProcessorResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateQueryProcessorResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateQueryProcessorResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateQueryProcessorResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public CreateQueryProcessorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateQueryProcessorResponseBodyResult setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public CreateQueryProcessorResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
