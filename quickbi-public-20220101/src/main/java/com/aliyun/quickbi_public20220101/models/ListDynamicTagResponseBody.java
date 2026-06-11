// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDynamicTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A**********DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDynamicTagResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDynamicTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicTagResponseBody self = new ListDynamicTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDynamicTagResponseBody setResult(java.util.List<ListDynamicTagResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDynamicTagResponseBodyResult> getResult() {
        return this.result;
    }

    public ListDynamicTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDynamicTagResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>site_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>cfg****14352318681088</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <strong>example:</strong>
         * <p>eip</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <strong>example:</strong>
         * <p>a201c85c-******</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <strong>example:</strong>
         * <p>2fe4fbd8-<strong><strong>-</strong></strong>-b3e1-e92c7af083ea</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RelatedAttribute")
        public Integer relatedAttribute;

        /**
         * <strong>example:</strong>
         * <p>testTable02\&quot;\&quot;</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListDynamicTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicTagResponseBodyResult self = new ListDynamicTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDynamicTagResponseBodyResult setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDynamicTagResponseBodyResult setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListDynamicTagResponseBodyResult setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListDynamicTagResponseBodyResult setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public ListDynamicTagResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListDynamicTagResponseBodyResult setRelatedAttribute(Integer relatedAttribute) {
            this.relatedAttribute = relatedAttribute;
            return this;
        }
        public Integer getRelatedAttribute() {
            return this.relatedAttribute;
        }

        public ListDynamicTagResponseBodyResult setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
