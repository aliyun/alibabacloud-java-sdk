// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The label key of the associated service workload. Set the value to `ASM_TRAFFIC_TAG`.</p>
     */
    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    /**
     * <p>The label value of the associated service workload.``</p>
     */
    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>A list of services associated with the lane.</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    /**
     * <p>The name of the lane.</p>
     */
    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static UpdateSwimLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneRequest self = new UpdateSwimLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateSwimLaneRequest setLabelSelectorKey(String labelSelectorKey) {
        this.labelSelectorKey = labelSelectorKey;
        return this;
    }
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    public UpdateSwimLaneRequest setLabelSelectorValue(String labelSelectorValue) {
        this.labelSelectorValue = labelSelectorValue;
        return this;
    }
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    public UpdateSwimLaneRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateSwimLaneRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

    public UpdateSwimLaneRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
