// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSecondRanksResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSecondRanksResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListSecondRanksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecondRanksResponseBody self = new ListSecondRanksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecondRanksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecondRanksResponseBody setResult(java.util.List<ListSecondRanksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSecondRanksResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSecondRanksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSecondRanksResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("isDefault")
        public String isDefault;

        @NameInMap("isSys")
        public String isSys;

        @NameInMap("meta")
        public String meta;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        public static ListSecondRanksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSecondRanksResponseBodyResult self = new ListSecondRanksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSecondRanksResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListSecondRanksResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListSecondRanksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecondRanksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSecondRanksResponseBodyResult setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListSecondRanksResponseBodyResult setIsSys(String isSys) {
            this.isSys = isSys;
            return this;
        }
        public String getIsSys() {
            return this.isSys;
        }

        public ListSecondRanksResponseBodyResult setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public ListSecondRanksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecondRanksResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
