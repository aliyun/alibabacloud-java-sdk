// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeSecondRankResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeSecondRankResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeSecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondRankResponseBody self = new DescribeSecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecondRankResponseBody setResult(DescribeSecondRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSecondRankResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeSecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecondRankResponseBodyResult extends TeaModel {
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

        public static DescribeSecondRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecondRankResponseBodyResult self = new DescribeSecondRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSecondRankResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeSecondRankResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
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

        public DescribeSecondRankResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecondRankResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public DescribeSecondRankResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSecondRankResponseBodyResult setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public DescribeSecondRankResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
