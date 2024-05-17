// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("AppGroupName")
    public String appGroupName;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the **Namespace** page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public ListGroupsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListGroupsRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ListGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
