// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkerListRequest extends TeaModel {
    /**
     * <p>The ID of the permission group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>usercenter</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the namespace. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetWorkerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerListRequest self = new GetWorkerListRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkerListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetWorkerListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetWorkerListRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetWorkerListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
