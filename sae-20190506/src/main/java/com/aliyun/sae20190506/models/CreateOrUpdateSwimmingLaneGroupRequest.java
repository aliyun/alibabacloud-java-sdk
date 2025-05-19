// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <strong>example:</strong>
     * <p>mse_ingresspost-cn-axc49******</p>
     */
    @NameInMap("EntryAppId")
    public String entryAppId;

    /**
     * <strong>example:</strong>
     * <p>mse-gw</p>
     */
    @NameInMap("EntryAppType")
    public String entryAppType;

    /**
     * <strong>example:</strong>
     * <p>2047</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>mse-test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SwimVersion")
    public String swimVersion;

    public static CreateOrUpdateSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupRequest self = new CreateOrUpdateSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setEntryAppId(String entryAppId) {
        this.entryAppId = entryAppId;
        return this;
    }
    public String getEntryAppId() {
        return this.entryAppId;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setEntryAppType(String entryAppType) {
        this.entryAppType = entryAppType;
        return this;
    }
    public String getEntryAppType() {
        return this.entryAppType;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setSwimVersion(String swimVersion) {
        this.swimVersion = swimVersion;
        return this;
    }
    public String getSwimVersion() {
        return this.swimVersion;
    }

}
