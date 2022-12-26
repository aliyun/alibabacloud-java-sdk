// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreCheckItemsRequest extends TeaModel {
    @NameInMap("CheckAndRiskTypeList")
    public java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> checkAndRiskTypeList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static IgnoreCheckItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreCheckItemsRequest self = new IgnoreCheckItemsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreCheckItemsRequest setCheckAndRiskTypeList(java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> checkAndRiskTypeList) {
        this.checkAndRiskTypeList = checkAndRiskTypeList;
        return this;
    }
    public java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> getCheckAndRiskTypeList() {
        return this.checkAndRiskTypeList;
    }

    public IgnoreCheckItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public IgnoreCheckItemsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreCheckItemsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public IgnoreCheckItemsRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class IgnoreCheckItemsRequestCheckAndRiskTypeList extends TeaModel {
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("RiskType")
        public String riskType;

        public static IgnoreCheckItemsRequestCheckAndRiskTypeList build(java.util.Map<String, ?> map) throws Exception {
            IgnoreCheckItemsRequestCheckAndRiskTypeList self = new IgnoreCheckItemsRequestCheckAndRiskTypeList();
            return TeaModel.build(map, self);
        }

        public IgnoreCheckItemsRequestCheckAndRiskTypeList setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public IgnoreCheckItemsRequestCheckAndRiskTypeList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

}
