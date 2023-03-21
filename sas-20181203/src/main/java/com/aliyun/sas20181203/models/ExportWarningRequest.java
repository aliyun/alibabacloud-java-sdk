// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportWarningRequest extends TeaModel {
    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("IsCleartextPwd")
    public Integer isCleartextPwd;

    @NameInMap("IsSummaryExport")
    public Integer isSummaryExport;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RiskIds")
    public String riskIds;

    @NameInMap("RiskLevels")
    public String riskLevels;

    @NameInMap("RiskName")
    public String riskName;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("StrategyId")
    public Long strategyId;

    @NameInMap("SubTypeNames")
    public String subTypeNames;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("TypeNames")
    public String typeNames;

    @NameInMap("Uuids")
    public String uuids;

    public static ExportWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportWarningRequest self = new ExportWarningRequest();
        return TeaModel.build(map, self);
    }

    public ExportWarningRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ExportWarningRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportWarningRequest setIsCleartextPwd(Integer isCleartextPwd) {
        this.isCleartextPwd = isCleartextPwd;
        return this;
    }
    public Integer getIsCleartextPwd() {
        return this.isCleartextPwd;
    }

    public ExportWarningRequest setIsSummaryExport(Integer isSummaryExport) {
        this.isSummaryExport = isSummaryExport;
        return this;
    }
    public Integer getIsSummaryExport() {
        return this.isSummaryExport;
    }

    public ExportWarningRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportWarningRequest setRiskIds(String riskIds) {
        this.riskIds = riskIds;
        return this;
    }
    public String getRiskIds() {
        return this.riskIds;
    }

    public ExportWarningRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public ExportWarningRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public ExportWarningRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ExportWarningRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ExportWarningRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public ExportWarningRequest setSubTypeNames(String subTypeNames) {
        this.subTypeNames = subTypeNames;
        return this;
    }
    public String getSubTypeNames() {
        return this.subTypeNames;
    }

    public ExportWarningRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public ExportWarningRequest setTypeNames(String typeNames) {
        this.typeNames = typeNames;
        return this;
    }
    public String getTypeNames() {
        return this.typeNames;
    }

    public ExportWarningRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
