// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListApiPluginsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>024f8cf0-c842-4c01-b74b-c8667e4579c7</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>[&quot;d17d5bfa-4972-4389-9718-f9602edabe48&quot;]</p>
     */
    @NameInMap("UuidsJson")
    public String uuidsJson;

    public static ListApiPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiPluginsRequest self = new ListApiPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListApiPluginsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApiPluginsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApiPluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiPluginsRequest setUuidsJson(String uuidsJson) {
        this.uuidsJson = uuidsJson;
        return this;
    }
    public String getUuidsJson() {
        return this.uuidsJson;
    }

}
