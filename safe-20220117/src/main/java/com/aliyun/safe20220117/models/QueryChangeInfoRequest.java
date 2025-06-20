// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryChangeInfoRequest extends TeaModel {
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

    @NameInMap("ChangeSystem")
    public String changeSystem;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("LevelTree")
    public QueryChangeInfoRequestLevelTree levelTree;

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

    @NameInMap("Type")
    public String type;

    public static QueryChangeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChangeInfoRequest self = new QueryChangeInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryChangeInfoRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryChangeInfoRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryChangeInfoRequest setAz(java.util.List<String> az) {
        this.az = az;
        return this;
    }
    public java.util.List<String> getAz() {
        return this.az;
    }

    public QueryChangeInfoRequest setBgVid(String bgVid) {
        this.bgVid = bgVid;
        return this;
    }
    public String getBgVid() {
        return this.bgVid;
    }

    public QueryChangeInfoRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public QueryChangeInfoRequest setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
        return this;
    }
    public String getChangeSystem() {
        return this.changeSystem;
    }

    public QueryChangeInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryChangeInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryChangeInfoRequest setLevelTree(QueryChangeInfoRequestLevelTree levelTree) {
        this.levelTree = levelTree;
        return this;
    }
    public QueryChangeInfoRequestLevelTree getLevelTree() {
        return this.levelTree;
    }

    public QueryChangeInfoRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryChangeInfoRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryChangeInfoRequest setProduct(java.util.List<String> product) {
        this.product = product;
        return this;
    }
    public java.util.List<String> getProduct() {
        return this.product;
    }

    public QueryChangeInfoRequest setRegion(java.util.List<String> region) {
        this.region = region;
        return this;
    }
    public java.util.List<String> getRegion() {
        return this.region;
    }

    public QueryChangeInfoRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public QueryChangeInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryChangeInfoRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public QueryChangeInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryChangeInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class QueryChangeInfoRequestLevelTreeTreeData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        @NameInMap("DataSubType")
        public String dataSubType;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static QueryChangeInfoRequestLevelTreeTreeData build(java.util.Map<String, ?> map) throws Exception {
            QueryChangeInfoRequestLevelTreeTreeData self = new QueryChangeInfoRequestLevelTreeTreeData();
            return TeaModel.build(map, self);
        }

        public QueryChangeInfoRequestLevelTreeTreeData setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

        public QueryChangeInfoRequestLevelTreeTreeData setDataSubType(String dataSubType) {
            this.dataSubType = dataSubType;
            return this;
        }
        public String getDataSubType() {
            return this.dataSubType;
        }

        public QueryChangeInfoRequestLevelTreeTreeData setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class QueryChangeInfoRequestLevelTree extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("TreeData")
        public java.util.List<QueryChangeInfoRequestLevelTreeTreeData> treeData;

        public static QueryChangeInfoRequestLevelTree build(java.util.Map<String, ?> map) throws Exception {
            QueryChangeInfoRequestLevelTree self = new QueryChangeInfoRequestLevelTree();
            return TeaModel.build(map, self);
        }

        public QueryChangeInfoRequestLevelTree setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryChangeInfoRequestLevelTree setTreeData(java.util.List<QueryChangeInfoRequestLevelTreeTreeData> treeData) {
            this.treeData = treeData;
            return this;
        }
        public java.util.List<QueryChangeInfoRequestLevelTreeTreeData> getTreeData() {
            return this.treeData;
        }

    }

}
