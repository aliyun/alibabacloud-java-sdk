// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Realtime")
    public Boolean realtime;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    @NameInMap("Type")
    public String type;

    public static ListABMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListABMetricsRequest self = new ListABMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListABMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListABMetricsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListABMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListABMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListABMetricsRequest setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public ListABMetricsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListABMetricsRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public ListABMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
