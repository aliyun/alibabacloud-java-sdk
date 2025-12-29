// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSecondRanksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the fine sort expression.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/170008.html">SecondRank</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListSecondRanksResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The time when the expression was created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
         * <p>false</p>
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
         * <p>true</p>
         */
        @NameInMap("isSys")
        public String isSys;

        /**
         * <p>The content of the fine sort expression. You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.</p>
         * 
         * <strong>example:</strong>
         * <p>random()+now()</p>
         */
        @NameInMap("meta")
        public String meta;

        /**
         * <p>Parameter</p>
         * 
         * <strong>example:</strong>
         * <p>tests</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time when the expression was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1587052801</p>
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
