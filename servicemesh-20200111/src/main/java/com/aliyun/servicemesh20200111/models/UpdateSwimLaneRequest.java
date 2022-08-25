// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneRequest extends TeaModel {
    @NameInMap("AddedServicesList")
    public String addedServicesList;

    @NameInMap("DeletedServicesList")
    public String deletedServicesList;

    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static UpdateSwimLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneRequest self = new UpdateSwimLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneRequest setAddedServicesList(String addedServicesList) {
        this.addedServicesList = addedServicesList;
        return this;
    }
    public String getAddedServicesList() {
        return this.addedServicesList;
    }

    public UpdateSwimLaneRequest setDeletedServicesList(String deletedServicesList) {
        this.deletedServicesList = deletedServicesList;
        return this;
    }
    public String getDeletedServicesList() {
        return this.deletedServicesList;
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

    public UpdateSwimLaneRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
