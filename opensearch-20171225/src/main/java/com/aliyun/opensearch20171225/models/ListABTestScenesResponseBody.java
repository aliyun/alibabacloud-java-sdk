// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestScenesResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListABTestScenesResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListABTestScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestScenesResponseBody self = new ListABTestScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestScenesResponseBody setResult(java.util.List<ListABTestScenesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestScenesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListABTestScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListABTestScenesResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("values")
        public java.util.List<String> values;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("id")
        public String id;

        public static ListABTestScenesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestScenesResponseBodyResult self = new ListABTestScenesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestScenesResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestScenesResponseBodyResult setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public ListABTestScenesResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListABTestScenesResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListABTestScenesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestScenesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
