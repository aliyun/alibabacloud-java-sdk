// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryBlockEventRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgSystemName")
    public String bgSystemName;

    @NameInMap("BlockHarm")
    public String blockHarm;

    @NameInMap("Category")
    public String category;

    @NameInMap("DeptNo")
    public String deptNo;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedRule")
    public Boolean needRule;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("ProductCodes")
    public java.util.List<String> productCodes;

    @NameInMap("RegionReqs")
    public java.util.List<QueryBlockEventRequestRegionReqs> regionReqs;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("Scope")
    public java.util.List<String> scope;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryBlockEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockEventRequest self = new QueryBlockEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockEventRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryBlockEventRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryBlockEventRequest setBgSystemName(String bgSystemName) {
        this.bgSystemName = bgSystemName;
        return this;
    }
    public String getBgSystemName() {
        return this.bgSystemName;
    }

    public QueryBlockEventRequest setBlockHarm(String blockHarm) {
        this.blockHarm = blockHarm;
        return this;
    }
    public String getBlockHarm() {
        return this.blockHarm;
    }

    public QueryBlockEventRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryBlockEventRequest setDeptNo(String deptNo) {
        this.deptNo = deptNo;
        return this;
    }
    public String getDeptNo() {
        return this.deptNo;
    }

    public QueryBlockEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryBlockEventRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryBlockEventRequest setNeedRule(Boolean needRule) {
        this.needRule = needRule;
        return this;
    }
    public Boolean getNeedRule() {
        return this.needRule;
    }

    public QueryBlockEventRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryBlockEventRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public QueryBlockEventRequest setRegionReqs(java.util.List<QueryBlockEventRequestRegionReqs> regionReqs) {
        this.regionReqs = regionReqs;
        return this;
    }
    public java.util.List<QueryBlockEventRequestRegionReqs> getRegionReqs() {
        return this.regionReqs;
    }

    public QueryBlockEventRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public QueryBlockEventRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public QueryBlockEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryBlockEventRequestRegionReqs extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Regions")
        public java.util.List<String> regions;

        public static QueryBlockEventRequestRegionReqs build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventRequestRegionReqs self = new QueryBlockEventRequestRegionReqs();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventRequestRegionReqs setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryBlockEventRequestRegionReqs setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

    }

}
