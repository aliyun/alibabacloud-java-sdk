// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptsRequest extends TeaModel {
    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>搜索关键词</p>
     * 
     * <strong>example:</strong>
     * <p>满意度调研</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>页码，从1开始</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>每页记录数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>是否仅返回已发布的场景</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublishOnly")
    public Boolean publishOnly;

    /**
     * <p>场景ID列表</p>
     */
    @NameInMap("ScriptIds")
    public java.util.List<String> scriptIds;

    public static ListScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsRequest self = new ListScriptsRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScriptsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListScriptsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScriptsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScriptsRequest setPublishOnly(Boolean publishOnly) {
        this.publishOnly = publishOnly;
        return this;
    }
    public Boolean getPublishOnly() {
        return this.publishOnly;
    }

    public ListScriptsRequest setScriptIds(java.util.List<String> scriptIds) {
        this.scriptIds = scriptIds;
        return this;
    }
    public java.util.List<String> getScriptIds() {
        return this.scriptIds;
    }

}
