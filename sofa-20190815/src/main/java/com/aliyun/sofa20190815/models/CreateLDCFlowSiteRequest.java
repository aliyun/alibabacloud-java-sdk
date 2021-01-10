// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFlowSiteRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InterfaceType")
    public String interfaceType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("SiteType")
    public String siteType;

    @NameInMap("UniqueId")
    public String uniqueId;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    @NameInMap("InterfaceUrlsRepeatList")
    public java.util.List<String> interfaceUrlsRepeatList;

    public static CreateLDCFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFlowSiteRequest self = new CreateLDCFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFlowSiteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLDCFlowSiteRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public CreateLDCFlowSiteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFlowSiteRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateLDCFlowSiteRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public CreateLDCFlowSiteRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateLDCFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateLDCFlowSiteRequest setInterfaceUrlsRepeatList(java.util.List<String> interfaceUrlsRepeatList) {
        this.interfaceUrlsRepeatList = interfaceUrlsRepeatList;
        return this;
    }
    public java.util.List<String> getInterfaceUrlsRepeatList() {
        return this.interfaceUrlsRepeatList;
    }

}
