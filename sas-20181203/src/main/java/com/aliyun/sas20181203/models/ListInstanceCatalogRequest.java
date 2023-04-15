// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the region in which the asset resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: International</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of requirement items.</p>
     */
    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    /**
     * <p>The IDs of standards.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The types of check standards.</p>
     */
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
