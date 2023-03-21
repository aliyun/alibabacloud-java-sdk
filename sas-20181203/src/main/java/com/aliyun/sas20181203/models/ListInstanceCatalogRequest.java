// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListInstanceCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCatalogRequest self = new ListInstanceCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceCatalogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListInstanceCatalogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstanceCatalogRequest setRequirementIds(java.util.List<Long> requirementIds) {
        this.requirementIds = requirementIds;
        return this;
    }
    public java.util.List<Long> getRequirementIds() {
        return this.requirementIds;
    }

    public ListInstanceCatalogRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ListInstanceCatalogRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
