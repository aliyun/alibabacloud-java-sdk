// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricsRequest extends TeaModel {
    /**
     * <p>The instance ID. Call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name to use for filtering metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>home</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to filter for real-time metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <p>The scene ID. Call the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The data table ID. Call the ListTableMetas operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>The metric type. You can use this parameter to filter the results. Valid values:</p>
     * <ul>
     * <li><p><code>Single</code>: A single metric.</p>
     * </li>
     * <li><p><code>Derived</code>: A derived metric.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
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
