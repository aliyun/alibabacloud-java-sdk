// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorResponseBody extends TeaModel {
    @NameInMap("result")
    public ModifyQueryProcessorResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static ModifyQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQueryProcessorResponseBody self = new ModifyQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQueryProcessorResponseBody setResult(ModifyQueryProcessorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyQueryProcessorResponseBodyResult getResult() {
        return this.result;
    }

    public ModifyQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyQueryProcessorResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("active")
        public Boolean active;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        public static ModifyQueryProcessorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyQueryProcessorResponseBodyResult self = new ModifyQueryProcessorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyQueryProcessorResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifyQueryProcessorResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
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

        public ModifyQueryProcessorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
