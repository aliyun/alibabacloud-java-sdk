// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowSiteRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InterfaceType")
    public String interfaceType;

    @NameInMap("InterfaceUrlsRepeatList")
    public java.util.List<String> interfaceUrlsRepeatList;

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

    public static UpdateLDCFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowSiteRequest self = new UpdateLDCFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowSiteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLDCFlowSiteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLDCFlowSiteRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public UpdateLDCFlowSiteRequest setInterfaceUrlsRepeatList(java.util.List<String> interfaceUrlsRepeatList) {
        this.interfaceUrlsRepeatList = interfaceUrlsRepeatList;
        return this;
    }
    public java.util.List<String> getInterfaceUrlsRepeatList() {
        return this.interfaceUrlsRepeatList;
    }

    public UpdateLDCFlowSiteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCFlowSiteRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCFlowSiteRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public UpdateLDCFlowSiteRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public UpdateLDCFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
