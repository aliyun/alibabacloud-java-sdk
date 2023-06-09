// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSecondRanksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each fine sort expression.</p>
     * <br>
     * <p>For more information, see [SecondRank](~~170008~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListSecondRanksResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>Indicates whether the expression is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the expression was created.</p>
         */
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

        /**
         * <p>The time when the expression was last updated.</p>
         */
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
