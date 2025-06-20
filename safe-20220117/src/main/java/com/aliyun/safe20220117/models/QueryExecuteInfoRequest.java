// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryExecuteInfoRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("Az")
    public java.util.List<String> az;

    @NameInMap("BgVid")
    public String bgVid;

    @NameInMap("BuId")
    public String buId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExVid")
    public String exVid;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("LevelTree")
    public QueryExecuteInfoRequestLevelTree levelTree;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Product")
    public java.util.List<String> product;

    @NameInMap("Region")
    public java.util.List<String> region;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryExecuteInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExecuteInfoRequest self = new QueryExecuteInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryExecuteInfoRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryExecuteInfoRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryExecuteInfoRequest setAz(java.util.List<String> az) {
        this.az = az;
        return this;
    }
    public java.util.List<String> getAz() {
        return this.az;
    }

    public QueryExecuteInfoRequest setBgVid(String bgVid) {
        this.bgVid = bgVid;
        return this;
    }
    public String getBgVid() {
        return this.bgVid;
    }

    public QueryExecuteInfoRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public QueryExecuteInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryExecuteInfoRequest setExVid(String exVid) {
        this.exVid = exVid;
        return this;
    }
    public String getExVid() {
        return this.exVid;
    }

    public QueryExecuteInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryExecuteInfoRequest setLevelTree(QueryExecuteInfoRequestLevelTree levelTree) {
        this.levelTree = levelTree;
        return this;
    }
    public QueryExecuteInfoRequestLevelTree getLevelTree() {
        return this.levelTree;
    }

    public QueryExecuteInfoRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryExecuteInfoRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryExecuteInfoRequest setProduct(java.util.List<String> product) {
        this.product = product;
        return this;
    }
    public java.util.List<String> getProduct() {
        return this.product;
    }

    public QueryExecuteInfoRequest setRegion(java.util.List<String> region) {
        this.region = region;
        return this;
    }
    public java.util.List<String> getRegion() {
        return this.region;
    }

    public QueryExecuteInfoRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public QueryExecuteInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryExecuteInfoRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public QueryExecuteInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryExecuteInfoRequestLevelTreeTreeData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        @NameInMap("DataSubType")
        public String dataSubType;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static QueryExecuteInfoRequestLevelTreeTreeData build(java.util.Map<String, ?> map) throws Exception {
            QueryExecuteInfoRequestLevelTreeTreeData self = new QueryExecuteInfoRequestLevelTreeTreeData();
            return TeaModel.build(map, self);
        }

        public QueryExecuteInfoRequestLevelTreeTreeData setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

        public QueryExecuteInfoRequestLevelTreeTreeData setDataSubType(String dataSubType) {
            this.dataSubType = dataSubType;
            return this;
        }
        public String getDataSubType() {
            return this.dataSubType;
        }

        public QueryExecuteInfoRequestLevelTreeTreeData setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class QueryExecuteInfoRequestLevelTree extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("TreeData")
        public java.util.List<QueryExecuteInfoRequestLevelTreeTreeData> treeData;

        public static QueryExecuteInfoRequestLevelTree build(java.util.Map<String, ?> map) throws Exception {
            QueryExecuteInfoRequestLevelTree self = new QueryExecuteInfoRequestLevelTree();
            return TeaModel.build(map, self);
        }

        public QueryExecuteInfoRequestLevelTree setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryExecuteInfoRequestLevelTree setTreeData(java.util.List<QueryExecuteInfoRequestLevelTreeTreeData> treeData) {
            this.treeData = treeData;
            return this;
        }
        public java.util.List<QueryExecuteInfoRequestLevelTreeTreeData> getTreeData() {
            return this.treeData;
        }

    }

}
