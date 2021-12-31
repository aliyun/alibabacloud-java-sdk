// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListUserAnalyzersResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListUserAnalyzersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzersResponseBody self = new ListUserAnalyzersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAnalyzersResponseBody setResult(java.util.List<ListUserAnalyzersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserAnalyzersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListUserAnalyzersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserAnalyzersResponseBodyResultDicts extends TeaModel {
        @NameInMap("available")
        public Boolean available;

        @NameInMap("created")
        public Integer created;

        @NameInMap("entriesCount")
        public Integer entriesCount;

        @NameInMap("entriesLimit")
        public Integer entriesLimit;

        @NameInMap("id")
        public String id;

        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public Integer updated;

        public static ListUserAnalyzersResponseBodyResultDicts build(java.util.Map<String, ?> map) throws Exception {
            ListUserAnalyzersResponseBodyResultDicts self = new ListUserAnalyzersResponseBodyResultDicts();
            return TeaModel.build(map, self);
        }

        public ListUserAnalyzersResponseBodyResultDicts setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListUserAnalyzersResponseBodyResultDicts setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListUserAnalyzersResponseBodyResultDicts setEntriesCount(Integer entriesCount) {
            this.entriesCount = entriesCount;
            return this;
        }
        public Integer getEntriesCount() {
            return this.entriesCount;
        }

        public ListUserAnalyzersResponseBodyResultDicts setEntriesLimit(Integer entriesLimit) {
            this.entriesLimit = entriesLimit;
            return this;
        }
        public Integer getEntriesLimit() {
            return this.entriesLimit;
        }

        public ListUserAnalyzersResponseBodyResultDicts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserAnalyzersResponseBodyResultDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserAnalyzersResponseBodyResultDicts setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

    public static class ListUserAnalyzersResponseBodyResult extends TeaModel {
        @NameInMap("available")
        public Boolean available;

        @NameInMap("business")
        public String business;

        @NameInMap("created")
        public Integer created;

        @NameInMap("dicts")
        public java.util.List<ListUserAnalyzersResponseBodyResultDicts> dicts;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        public static ListUserAnalyzersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserAnalyzersResponseBodyResult self = new ListUserAnalyzersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserAnalyzersResponseBodyResult setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListUserAnalyzersResponseBodyResult setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListUserAnalyzersResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListUserAnalyzersResponseBodyResult setDicts(java.util.List<ListUserAnalyzersResponseBodyResultDicts> dicts) {
            this.dicts = dicts;
            return this;
        }
        public java.util.List<ListUserAnalyzersResponseBodyResultDicts> getDicts() {
            return this.dicts;
        }

        public ListUserAnalyzersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserAnalyzersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserAnalyzersResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
