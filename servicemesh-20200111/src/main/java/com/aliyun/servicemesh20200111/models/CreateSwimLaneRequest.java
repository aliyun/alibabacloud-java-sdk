// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServicesList")
    public String servicesList;

    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static CreateSwimLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSwimLaneRequest self = new CreateSwimLaneRequest();
        return TeaModel.build(map, self);
    }

    public CreateSwimLaneRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateSwimLaneRequest setLabelSelectorKey(String labelSelectorKey) {
        this.labelSelectorKey = labelSelectorKey;
        return this;
    }
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    public CreateSwimLaneRequest setLabelSelectorValue(String labelSelectorValue) {
        this.labelSelectorValue = labelSelectorValue;
        return this;
    }
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    public CreateSwimLaneRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public CreateSwimLaneRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

    public CreateSwimLaneRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
