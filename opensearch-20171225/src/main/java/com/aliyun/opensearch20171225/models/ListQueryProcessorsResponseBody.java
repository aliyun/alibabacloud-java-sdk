// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListQueryProcessorsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListQueryProcessorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorsResponseBody self = new ListQueryProcessorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorsResponseBody setResult(java.util.List<ListQueryProcessorsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListQueryProcessorsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListQueryProcessorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueryProcessorsResponseBodyResult extends TeaModel {
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

        public static ListQueryProcessorsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListQueryProcessorsResponseBodyResult self = new ListQueryProcessorsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListQueryProcessorsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListQueryProcessorsResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
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

        public ListQueryProcessorsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
