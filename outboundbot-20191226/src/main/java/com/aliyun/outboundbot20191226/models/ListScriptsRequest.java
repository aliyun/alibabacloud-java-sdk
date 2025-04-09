// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NluEngine")
    public String nluEngine;

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

    @NameInMap("ScriptName")
    public String scriptName;

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

    public ListScriptsRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
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

    public ListScriptsRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

}
