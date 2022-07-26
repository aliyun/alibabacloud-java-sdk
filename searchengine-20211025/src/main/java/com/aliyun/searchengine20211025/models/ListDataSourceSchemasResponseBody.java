// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourceSchemasResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDataSourceSchemasResponseBodyResult> result;

    public static ListDataSourceSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSchemasResponseBody self = new ListDataSourceSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceSchemasResponseBody setResult(java.util.List<ListDataSourceSchemasResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceSchemasResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourceSchemasResponseBodyResultPrimaryKey extends TeaModel {
        @NameInMap("hasPrimaryKeyAttribute")
        public Boolean hasPrimaryKeyAttribute;

        @NameInMap("isPrimaryKey")
        public Boolean isPrimaryKey;

        @NameInMap("isPrimaryKeySorted")
        public Boolean isPrimaryKeySorted;

        public static ListDataSourceSchemasResponseBodyResultPrimaryKey build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceSchemasResponseBodyResultPrimaryKey self = new ListDataSourceSchemasResponseBodyResultPrimaryKey();
            return TeaModel.build(map, self);
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setHasPrimaryKeyAttribute(Boolean hasPrimaryKeyAttribute) {
            this.hasPrimaryKeyAttribute = hasPrimaryKeyAttribute;
            return this;
        }
        public Boolean getHasPrimaryKeyAttribute() {
            return this.hasPrimaryKeyAttribute;
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setIsPrimaryKeySorted(Boolean isPrimaryKeySorted) {
            this.isPrimaryKeySorted = isPrimaryKeySorted;
            return this;
        }
        public Boolean getIsPrimaryKeySorted() {
            return this.isPrimaryKeySorted;
        }

    }

    public static class ListDataSourceSchemasResponseBodyResult extends TeaModel {
        @NameInMap("addIndex")
        public Boolean addIndex;

        @NameInMap("attribute")
        public Boolean attribute;

        @NameInMap("custom")
        public Boolean custom;

        @NameInMap("name")
        public String name;

        @NameInMap("primaryKey")
        public ListDataSourceSchemasResponseBodyResultPrimaryKey primaryKey;

        @NameInMap("summary")
        public Boolean summary;

        @NameInMap("type")
        public String type;

        public static ListDataSourceSchemasResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceSchemasResponseBodyResult self = new ListDataSourceSchemasResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceSchemasResponseBodyResult setAddIndex(Boolean addIndex) {
            this.addIndex = addIndex;
            return this;
        }
        public Boolean getAddIndex() {
            return this.addIndex;
        }

        public ListDataSourceSchemasResponseBodyResult setAttribute(Boolean attribute) {
            this.attribute = attribute;
            return this;
        }
        public Boolean getAttribute() {
            return this.attribute;
        }

        public ListDataSourceSchemasResponseBodyResult setCustom(Boolean custom) {
            this.custom = custom;
            return this;
        }
        public Boolean getCustom() {
            return this.custom;
        }

        public ListDataSourceSchemasResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceSchemasResponseBodyResult setPrimaryKey(ListDataSourceSchemasResponseBodyResultPrimaryKey primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public ListDataSourceSchemasResponseBodyResultPrimaryKey getPrimaryKey() {
            return this.primaryKey;
        }

        public ListDataSourceSchemasResponseBodyResult setSummary(Boolean summary) {
            this.summary = summary;
            return this;
        }
        public Boolean getSummary() {
            return this.summary;
        }

        public ListDataSourceSchemasResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
