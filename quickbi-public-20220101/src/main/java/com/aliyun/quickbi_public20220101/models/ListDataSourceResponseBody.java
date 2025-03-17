// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataSourceResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7FC9A6A6-****-5CED-B*****E891E4075</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Array of data source information.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListDataSourceResponseBodyResult> result;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponseBody self = new ListDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceResponseBody setResult(java.util.List<ListDataSourceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceResponseBodyResult> getResult() {
        return this.result;
    }

    public ListDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataSourceResponseBodyResult extends TeaModel {
        /**
         * <p>Quick BI user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>281*****-485******-8</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Owner\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>Data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7FC9A6A6-****-5CED-B*****E891E4075</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <p>Data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <p>Creation time of the data source, in yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-16 13:17:39</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-15 10:06:31</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary data source type for multi-engine data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("ParentDsType")
        public String parentDsType;

        /**
         * <p>Display name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>0327</p>
         */
        @NameInMap("ShowName")
        public String showName;

        public static ListDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyResult self = new ListDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataSourceResponseBodyResult setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListDataSourceResponseBodyResult setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListDataSourceResponseBodyResult setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListDataSourceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourceResponseBodyResult setParentDsType(String parentDsType) {
            this.parentDsType = parentDsType;
            return this;
        }
        public String getParentDsType() {
            return this.parentDsType;
        }

        public ListDataSourceResponseBodyResult setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
