// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The label key of the associated service workload. Set the value to <code>ASM_TRAFFIC_TAG</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ASM_TRAFFIC_TAG</p>
     */
    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    /**
     * <p>The label value of the associated service workload.``</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The list of services associated with the lane. The value is a JSON array. The format of a single service is <code>$Cluster name/$Cluster ID/$Namespace/$Service name</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka\&quot;,\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb\&quot;,\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc\&quot;]</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    /**
     * <p>The name of the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>s3</p>
     */
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
