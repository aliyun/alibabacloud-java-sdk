// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogRequest extends TeaModel {
    /**
     * <p>The language type of the request and response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to filter assets that support custom checks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Filters assets that support custom checks.</li>
     * <li><strong>false</strong>: All check assets. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyCustom")
    public Boolean onlyCustom;

    /**
     * <p>The ID of the region where the instance to be queried is located. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Center.</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of requirement IDs.</p>
     */
    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    /**
     * <p>The list of standard IDs.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The list of task sources.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    /**
     * <p>The list of types to which the check standards belong.</p>
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

    public ListInstanceCatalogRequest setOnlyCustom(Boolean onlyCustom) {
        this.onlyCustom = onlyCustom;
        return this;
    }
    public Boolean getOnlyCustom() {
        return this.onlyCustom;
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

    public ListInstanceCatalogRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    public ListInstanceCatalogRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
