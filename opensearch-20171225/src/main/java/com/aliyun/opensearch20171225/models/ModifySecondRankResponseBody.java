// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the fine sort expression.</p>
     */
    @NameInMap("result")
    public ModifySecondRankResponseBodyResult result;

    public static ModifySecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecondRankResponseBody self = new ModifySecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecondRankResponseBody setResult(ModifySecondRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifySecondRankResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifySecondRankResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the expression is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        /**
         * <p>The description of the expression.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the expression. This parameter appears only in the response.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Indicates whether the expression is the default one. This parameter appears only in the response. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("isDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the expression is a system expression. This parameter appears only in the response. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("isSys")
        public String isSys;

        /**
         * <p>The content of the fine sort expression.</p>
         * <br>
         * <p>You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.</p>
         */
        @NameInMap("meta")
        public String meta;

        /**
         * <p>The name of the expression.</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        public static ModifySecondRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifySecondRankResponseBodyResult self = new ModifySecondRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifySecondRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ModifySecondRankResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifySecondRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecondRankResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

        public ModifySecondRankResponseBodyResult setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public ModifySecondRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifySecondRankResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
