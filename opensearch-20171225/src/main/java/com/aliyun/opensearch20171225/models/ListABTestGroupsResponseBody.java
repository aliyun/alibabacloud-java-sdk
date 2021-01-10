// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestGroupsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListABTestGroupsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListABTestGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestGroupsResponseBody self = new ListABTestGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestGroupsResponseBody setResult(java.util.List<ListABTestGroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestGroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListABTestGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListABTestGroupsResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("id")
        public String id;

        public static ListABTestGroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestGroupsResponseBodyResult self = new ListABTestGroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestGroupsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestGroupsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListABTestGroupsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListABTestGroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestGroupsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
