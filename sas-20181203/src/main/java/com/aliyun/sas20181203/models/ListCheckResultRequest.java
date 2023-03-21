// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultRequest extends TeaModel {
    @NameInMap("CheckKey")
    public String checkKey;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    @NameInMap("SortTypes")
    public java.util.List<String> sortTypes;

    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("Types")
    public java.util.List<String> types;

    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ListCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultRequest self = new ListCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckResultRequest setCheckKey(String checkKey) {
        this.checkKey = checkKey;
        return this;
    }
    public String getCheckKey() {
        return this.checkKey;
    }

    public ListCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListCheckResultRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCheckResultRequest setRequirementIds(java.util.List<Long> requirementIds) {
        this.requirementIds = requirementIds;
        return this;
    }
    public java.util.List<Long> getRequirementIds() {
        return this.requirementIds;
    }

    public ListCheckResultRequest setRiskLevels(java.util.List<String> riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public java.util.List<String> getRiskLevels() {
        return this.riskLevels;
    }

    public ListCheckResultRequest setSortTypes(java.util.List<String> sortTypes) {
        this.sortTypes = sortTypes;
        return this;
    }
    public java.util.List<String> getSortTypes() {
        return this.sortTypes;
    }

    public ListCheckResultRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ListCheckResultRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListCheckResultRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListCheckResultRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
