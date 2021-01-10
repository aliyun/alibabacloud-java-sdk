// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminiterationtemplateRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FabricBizType")
    public String fabricBizType;

    @NameInMap("Id")
    public String id;

    @NameInMap("IndependentComplete")
    public Boolean independentComplete;

    @NameInMap("Name")
    public String name;

    @NameInMap("NeedProject")
    public Boolean needProject;

    @NameInMap("NeedWorkItem")
    public Boolean needWorkItem;

    @NameInMap("StagesRepeatList")
    public java.util.List<String> stagesRepeatList;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("XflushCheckEnable")
    public Boolean xflushCheckEnable;

    public static SaveLinkeBahamutAdminiterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminiterationtemplateRequest self = new SaveLinkeBahamutAdminiterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setFabricBizType(String fabricBizType) {
        this.fabricBizType = fabricBizType;
        return this;
    }
    public String getFabricBizType() {
        return this.fabricBizType;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setIndependentComplete(Boolean independentComplete) {
        this.independentComplete = independentComplete;
        return this;
    }
    public Boolean getIndependentComplete() {
        return this.independentComplete;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setNeedProject(Boolean needProject) {
        this.needProject = needProject;
        return this;
    }
    public Boolean getNeedProject() {
        return this.needProject;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setNeedWorkItem(Boolean needWorkItem) {
        this.needWorkItem = needWorkItem;
        return this;
    }
    public Boolean getNeedWorkItem() {
        return this.needWorkItem;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setStagesRepeatList(java.util.List<String> stagesRepeatList) {
        this.stagesRepeatList = stagesRepeatList;
        return this;
    }
    public java.util.List<String> getStagesRepeatList() {
        return this.stagesRepeatList;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveLinkeBahamutAdminiterationtemplateRequest setXflushCheckEnable(Boolean xflushCheckEnable) {
        this.xflushCheckEnable = xflushCheckEnable;
        return this;
    }
    public Boolean getXflushCheckEnable() {
        return this.xflushCheckEnable;
    }

}
