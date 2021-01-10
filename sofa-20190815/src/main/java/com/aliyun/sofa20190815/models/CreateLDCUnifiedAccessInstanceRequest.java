// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCUnifiedAccessInstanceRequest extends TeaModel {
    @NameInMap("SpannerCluster")
    public String spannerCluster;

    @NameInMap("UnifiedAccessInstanceHttpsEntryJsonStr")
    public String unifiedAccessInstanceHttpsEntryJsonStr;

    @NameInMap("UnifiedAccessInstanceHttpEntryJsonStr")
    public String unifiedAccessInstanceHttpEntryJsonStr;

    @NameInMap("UnifiedAccessInstanceName")
    public String unifiedAccessInstanceName;

    @NameInMap("UnifiedAccessInstanceType")
    public String unifiedAccessInstanceType;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static CreateLDCUnifiedAccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCUnifiedAccessInstanceRequest self = new CreateLDCUnifiedAccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCUnifiedAccessInstanceRequest setSpannerCluster(String spannerCluster) {
        this.spannerCluster = spannerCluster;
        return this;
    }
    public String getSpannerCluster() {
        return this.spannerCluster;
    }

    public CreateLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceHttpsEntryJsonStr(String unifiedAccessInstanceHttpsEntryJsonStr) {
        this.unifiedAccessInstanceHttpsEntryJsonStr = unifiedAccessInstanceHttpsEntryJsonStr;
        return this;
    }
    public String getUnifiedAccessInstanceHttpsEntryJsonStr() {
        return this.unifiedAccessInstanceHttpsEntryJsonStr;
    }

    public CreateLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceHttpEntryJsonStr(String unifiedAccessInstanceHttpEntryJsonStr) {
        this.unifiedAccessInstanceHttpEntryJsonStr = unifiedAccessInstanceHttpEntryJsonStr;
        return this;
    }
    public String getUnifiedAccessInstanceHttpEntryJsonStr() {
        return this.unifiedAccessInstanceHttpEntryJsonStr;
    }

    public CreateLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public CreateLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceType(String unifiedAccessInstanceType) {
        this.unifiedAccessInstanceType = unifiedAccessInstanceType;
        return this;
    }
    public String getUnifiedAccessInstanceType() {
        return this.unifiedAccessInstanceType;
    }

    public CreateLDCUnifiedAccessInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
