// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortExpressionsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSortExpressionsResponseBodyResult> result;

    public static ListSortExpressionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSortExpressionsResponseBody self = new ListSortExpressionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSortExpressionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSortExpressionsResponseBody setResult(java.util.List<ListSortExpressionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSortExpressionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListSortExpressionsResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        public static ListSortExpressionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSortExpressionsResponseBodyResult self = new ListSortExpressionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSortExpressionsResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListSortExpressionsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListSortExpressionsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSortExpressionsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSortExpressionsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
