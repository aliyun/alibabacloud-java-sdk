// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>13816111993</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScriptIds")
    public String scriptIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListScriptsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsShrinkRequest self = new ListScriptsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScriptsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListScriptsShrinkRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListScriptsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScriptsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScriptsShrinkRequest setScriptIdsShrink(String scriptIdsShrink) {
        this.scriptIdsShrink = scriptIdsShrink;
        return this;
    }
    public String getScriptIdsShrink() {
        return this.scriptIdsShrink;
    }

    public ListScriptsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
