// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeSecondRankResponseBody extends TeaModel {
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
     */
    @NameInMap("result")
    public DescribeSecondRankResponseBodyResult result;

    public static DescribeSecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondRankResponseBody self = new DescribeSecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecondRankResponseBody setResult(DescribeSecondRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSecondRankResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSecondRankResponseBodyResult extends TeaModel {
        /**
         * <p>Specifies whether to set the fine sort expression as the default sort expression.</p>
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
         * <p>1587052801</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the expression. This parameter appears only in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>89047</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Indicates whether the expression is the default one. This parameter appears only in the response. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the expression is a system expression. This parameter appears only in the response. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>random()+now()</p>
         */
        @NameInMap("meta")
        public String meta;

        /**
         * <p>The name.</p>
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

        public static DescribeSecondRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecondRankResponseBodyResult self = new DescribeSecondRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSecondRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeSecondRankResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeSecondRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecondRankResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSecondRankResponseBodyResult setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeSecondRankResponseBodyResult setIsSys(String isSys) {
            this.isSys = isSys;
            return this;
        }
        public String getIsSys() {
            return this.isSys;
        }

        public DescribeSecondRankResponseBodyResult setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public DescribeSecondRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSecondRankResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
