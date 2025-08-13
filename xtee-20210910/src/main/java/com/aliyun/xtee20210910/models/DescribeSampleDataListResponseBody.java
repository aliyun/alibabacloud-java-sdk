// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeSampleDataListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSampleDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataListResponseBody self = new DescribeSampleDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleDataListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataListResponseBody setResultObject(java.util.List<DescribeSampleDataListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleDataListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleDataListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleDataListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleDataListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Classification type, binary or multi-class.</p>
         * 
         * <strong>example:</strong>
         * <p>二分类</p>
         */
        @NameInMap("classificationType")
        public String classificationType;

        /**
         * <p>Criterion value for sample data calculation</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;正样本&quot;:&quot;1&quot;，&quot;负样本&quot;:&quot;1&quot;}</p>
         */
        @NameInMap("dataDistributed")
        public String dataDistributed;

        /**
         * <p>First row of sample data. Used to define the values of each column.</p>
         * 
         * <strong>example:</strong>
         * <p>17700000000</p>
         */
        @NameInMap("dataTitle")
        public String dataTitle;

        /**
         * <p>Deletion tag.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("deleteTag")
        public String deleteTag;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Name</p>
         * 
         * <strong>example:</strong>
         * <p>注册样本</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Number of normal samples</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("normalSize")
        public Long normalSize;

        /**
         * <p>Recall configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;variables&quot;:&quot;a,b,c&quot;}</p>
         */
        @NameInMap("recallConfig")
        public String recallConfig;

        /**
         * <p>Number of risk samples</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskSize")
        public Long riskSize;

        /**
         * <p>Specified risk value</p>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("riskValue")
        public String riskValue;

        /**
         * <p>Sample label details</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;positive&quot;,&quot;size&quot;:&quot;2000&quot;,&quot;value&quot;:1},{&quot;type&quot;:&quot;negative&quot;,&quot;size&quot;:1900,&quot;value&quot;:0}]</p>
         */
        @NameInMap("sampleLabelDetail")
        public String sampleLabelDetail;

        /**
         * <p>Sample size</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("sampleSize")
        public Long sampleSize;

        /**
         * <p>Scene code</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse_detection</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Storage path</p>
         * 
         * <strong>example:</strong>
         * <p>saf/de/sample/3dc2spspHKq4G3YI9d08</p>
         */
        @NameInMap("storePath")
        public String storePath;

        /**
         * <p>Storage type</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("storeType")
        public String storeType;

        /**
         * <p>Whether recall is supported</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportRecall")
        public String supportRecall;

        /**
         * <p>User UID</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>Version</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSampleDataListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleDataListResponseBodyResultObject self = new DescribeSampleDataListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleDataListResponseBodyResultObject setClassificationType(String classificationType) {
            this.classificationType = classificationType;
            return this;
        }
        public String getClassificationType() {
            return this.classificationType;
        }

        public DescribeSampleDataListResponseBodyResultObject setDataDistributed(String dataDistributed) {
            this.dataDistributed = dataDistributed;
            return this;
        }
        public String getDataDistributed() {
            return this.dataDistributed;
        }

        public DescribeSampleDataListResponseBodyResultObject setDataTitle(String dataTitle) {
            this.dataTitle = dataTitle;
            return this;
        }
        public String getDataTitle() {
            return this.dataTitle;
        }

        public DescribeSampleDataListResponseBodyResultObject setDeleteTag(String deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }
        public String getDeleteTag() {
            return this.deleteTag;
        }

        public DescribeSampleDataListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSampleDataListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSampleDataListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSampleDataListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleDataListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSampleDataListResponseBodyResultObject setNormalSize(Long normalSize) {
            this.normalSize = normalSize;
            return this;
        }
        public Long getNormalSize() {
            return this.normalSize;
        }

        public DescribeSampleDataListResponseBodyResultObject setRecallConfig(String recallConfig) {
            this.recallConfig = recallConfig;
            return this;
        }
        public String getRecallConfig() {
            return this.recallConfig;
        }

        public DescribeSampleDataListResponseBodyResultObject setRiskSize(Long riskSize) {
            this.riskSize = riskSize;
            return this;
        }
        public Long getRiskSize() {
            return this.riskSize;
        }

        public DescribeSampleDataListResponseBodyResultObject setRiskValue(String riskValue) {
            this.riskValue = riskValue;
            return this;
        }
        public String getRiskValue() {
            return this.riskValue;
        }

        public DescribeSampleDataListResponseBodyResultObject setSampleLabelDetail(String sampleLabelDetail) {
            this.sampleLabelDetail = sampleLabelDetail;
            return this;
        }
        public String getSampleLabelDetail() {
            return this.sampleLabelDetail;
        }

        public DescribeSampleDataListResponseBodyResultObject setSampleSize(Long sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }
        public Long getSampleSize() {
            return this.sampleSize;
        }

        public DescribeSampleDataListResponseBodyResultObject setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeSampleDataListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSampleDataListResponseBodyResultObject setStorePath(String storePath) {
            this.storePath = storePath;
            return this;
        }
        public String getStorePath() {
            return this.storePath;
        }

        public DescribeSampleDataListResponseBodyResultObject setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public DescribeSampleDataListResponseBodyResultObject setSupportRecall(String supportRecall) {
            this.supportRecall = supportRecall;
            return this;
        }
        public String getSupportRecall() {
            return this.supportRecall;
        }

        public DescribeSampleDataListResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeSampleDataListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
