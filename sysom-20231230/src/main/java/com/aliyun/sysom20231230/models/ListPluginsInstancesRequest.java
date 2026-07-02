// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPluginsInstancesRequest extends TeaModel {
    /**
     * <p>The current page number. This field is present when pagination is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>Filters instances by instance ID or instance name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bpxx</p>
     */
    @NameInMap("instance_id_name")
    public String instanceIdName;

    /**
     * <p>Filters instances by instance tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;app&quot;,&quot;value&quot;:&quot;sysom-aliyun-com&quot;}</p>
     */
    @NameInMap("instance_tag")
    public String instanceTag;

    /**
     * <p>Filters instances by plug-in installation status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>install</p>
     */
    @NameInMap("operation_type")
    public String operationType;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Filters the instance list by the specified agent. If this parameter is specified, only instances associated with the specified agent are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("plugin_id")
    public String pluginId;

    /**
     * <p>Filters instances by region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    public static ListPluginsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsInstancesRequest self = new ListPluginsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginsInstancesRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListPluginsInstancesRequest setInstanceIdName(String instanceIdName) {
        this.instanceIdName = instanceIdName;
        return this;
    }
    public String getInstanceIdName() {
        return this.instanceIdName;
    }

    public ListPluginsInstancesRequest setInstanceTag(String instanceTag) {
        this.instanceTag = instanceTag;
        return this;
    }
    public String getInstanceTag() {
        return this.instanceTag;
    }

    public ListPluginsInstancesRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListPluginsInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPluginsInstancesRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListPluginsInstancesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
