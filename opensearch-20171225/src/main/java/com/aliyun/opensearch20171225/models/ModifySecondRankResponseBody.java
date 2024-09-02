// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5E2F73C-8241-81F8-3A62-65478C5A3111</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the fine sort expression.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the expression was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The description of the expression.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;11&quot;</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expression ID. This parameter is displayed only in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>890473</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Indicates whether the expression is the default one. This parameter is displayed only in the response. Valid values:</p>
         * <ul>
         * <li>true: the expression is the default one.</li>
         * <li>false: the expression is not the default one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the expression is a system expression. This parameter is displayed only in the response. Valid values:</p>
         * <ul>
         * <li>true: The expression is a system expression.</li>
         * <li>false:The expression is not a system expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isSys")
        public String isSys;

        /**
         * <p>The content of the fine sort expression. You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_id &gt; 0 and cate_id &lt; 1000</p>
         */
        @NameInMap("meta")
        public String meta;

        /**
         * <p>The expression name.</p>
         * 
         * <strong>example:</strong>
         * <p>lsh_second_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time when the expression was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
