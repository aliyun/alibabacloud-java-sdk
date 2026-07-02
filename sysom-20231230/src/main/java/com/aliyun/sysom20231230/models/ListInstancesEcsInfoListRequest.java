// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesEcsInfoListRequest extends TeaModel {
    /**
     * <p>The type of information to retrieve.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("info_type")
    public String infoType;

    /**
     * <p>Specifies the instance ID to filter and return the Agent installation status of the specified instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp118piqcio9tiwgh84b</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    /**
     * <p>The management status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("managed_type")
    public String managedType;

    /**
     * <p>Specifies the component ID to filter and return the instance information list for the corresponding component.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("plugin_id")
    public String pluginId;

    /**
     * <p>The region used to filter instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    public static ListInstancesEcsInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesEcsInfoListRequest self = new ListInstancesEcsInfoListRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesEcsInfoListRequest setInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }
    public String getInfoType() {
        return this.infoType;
    }

    public ListInstancesEcsInfoListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesEcsInfoListRequest setManagedType(String managedType) {
        this.managedType = managedType;
        return this;
    }
    public String getManagedType() {
        return this.managedType;
    }

    public ListInstancesEcsInfoListRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListInstancesEcsInfoListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
