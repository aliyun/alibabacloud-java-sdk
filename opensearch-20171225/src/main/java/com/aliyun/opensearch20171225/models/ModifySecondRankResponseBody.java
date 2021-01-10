// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankResponseBody extends TeaModel {
    @NameInMap("result")
    public ModifySecondRankResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static ModifySecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecondRankResponseBody self = new ModifySecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecondRankResponseBody setResult(ModifySecondRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifySecondRankResponseBodyResult getResult() {
        return this.result;
    }

    public ModifySecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifySecondRankResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("active")
        public Boolean active;

        @NameInMap("isDefault")
        public String isDefault;

        @NameInMap("isSys")
        public String isSys;

        @NameInMap("description")
        public String description;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("meta")
        public String meta;

        @NameInMap("id")
        public String id;

        public static ModifySecondRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifySecondRankResponseBodyResult self = new ModifySecondRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifySecondRankResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifySecondRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ModifySecondRankResponseBodyResult setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ModifySecondRankResponseBodyResult setIsSys(String isSys) {
            this.isSys = isSys;
            return this;
        }
        public String getIsSys() {
            return this.isSys;
        }

        public ModifySecondRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecondRankResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ModifySecondRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifySecondRankResponseBodyResult setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public ModifySecondRankResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
