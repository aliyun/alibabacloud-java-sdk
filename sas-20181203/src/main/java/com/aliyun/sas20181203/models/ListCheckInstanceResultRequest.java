// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckInstanceResultRequest extends TeaModel {
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceIdKey")
    public String instanceIdKey;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("InstanceNameKey")
    public String instanceNameKey;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIdKey")
    public String regionIdKey;

    @NameInMap("SortTypes")
    public java.util.List<String> sortTypes;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListCheckInstanceResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckInstanceResultRequest self = new ListCheckInstanceResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckInstanceResultRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListCheckInstanceResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckInstanceResultRequest setInstanceIdKey(String instanceIdKey) {
        this.instanceIdKey = instanceIdKey;
        return this;
    }
    public String getInstanceIdKey() {
        return this.instanceIdKey;
    }

    public ListCheckInstanceResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListCheckInstanceResultRequest setInstanceNameKey(String instanceNameKey) {
        this.instanceNameKey = instanceNameKey;
        return this;
    }
    public String getInstanceNameKey() {
        return this.instanceNameKey;
    }

    public ListCheckInstanceResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckInstanceResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckInstanceResultRequest setRegionIdKey(String regionIdKey) {
        this.regionIdKey = regionIdKey;
        return this;
    }
    public String getRegionIdKey() {
        return this.regionIdKey;
    }

    public ListCheckInstanceResultRequest setSortTypes(java.util.List<String> sortTypes) {
        this.sortTypes = sortTypes;
        return this;
    }
    public java.util.List<String> getSortTypes() {
        return this.sortTypes;
    }

    public ListCheckInstanceResultRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
