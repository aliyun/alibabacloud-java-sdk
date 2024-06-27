// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeSampleDataListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("classificationType")
        public String classificationType;

        @NameInMap("dataDistributed")
        public String dataDistributed;

        @NameInMap("dataTitle")
        public String dataTitle;

        @NameInMap("deleteTag")
        public String deleteTag;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("normalSize")
        public Long normalSize;

        @NameInMap("recallConfig")
        public String recallConfig;

        @NameInMap("riskSize")
        public Long riskSize;

        @NameInMap("riskValue")
        public String riskValue;

        @NameInMap("sampleLabelDetail")
        public String sampleLabelDetail;

        @NameInMap("sampleSize")
        public Long sampleSize;

        @NameInMap("scene")
        public String scene;

        @NameInMap("status")
        public String status;

        @NameInMap("storePath")
        public String storePath;

        @NameInMap("storeType")
        public String storeType;

        @NameInMap("supportRecall")
        public String supportRecall;

        @NameInMap("userId")
        public Long userId;

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
