// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the baseline application.</p>
     */
    @NameInMap("AppIds")
    public String appIdsShrink;

    /**
     * <p>The unique ID of the corresponding gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_ingresspost-cn-axc49******</p>
     */
    @NameInMap("EntryAppId")
    public String entryAppId;

    /**
     * <p>The application entry type (gateway type).</p>
     * <ul>
     * <li><strong>apig:</strong> cloud-native API Gateway</li>
     * <li><strong>mse:</strong> Java Services Gateway</li>
     * <li><strong>mse-gw:</strong> MSE cloud-native Gateway</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse-gw</p>
     */
    @NameInMap("EntryAppType")
    public String entryAppType;

    /**
     * <p>The ID of the lane group. This is required when you update a lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>2047</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of a namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The end-to-end grayscale version. Valid values: 0 and 2 (recommended).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SwimVersion")
    public String swimVersion;

    public static CreateOrUpdateSwimmingLaneGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupShrinkRequest self = new CreateOrUpdateSwimmingLaneGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setAppIdsShrink(String appIdsShrink) {
        this.appIdsShrink = appIdsShrink;
        return this;
    }
    public String getAppIdsShrink() {
        return this.appIdsShrink;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setEntryAppId(String entryAppId) {
        this.entryAppId = entryAppId;
        return this;
    }
    public String getEntryAppId() {
        return this.entryAppId;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setEntryAppType(String entryAppType) {
        this.entryAppType = entryAppType;
        return this;
    }
    public String getEntryAppType() {
        return this.entryAppType;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setSwimVersion(String swimVersion) {
        this.swimVersion = swimVersion;
        return this;
    }
    public String getSwimVersion() {
        return this.swimVersion;
    }

}
