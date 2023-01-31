// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("Search")
    public String search;

    @NameInMap("StatesJson")
    public String statesJson;

    @NameInMap("UuidsJson")
    public String uuidsJson;

    public static ListScriptRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptRecordingRequest self = new ListScriptRecordingRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScriptRecordingRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScriptRecordingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScriptRecordingRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ListScriptRecordingRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListScriptRecordingRequest setStatesJson(String statesJson) {
        this.statesJson = statesJson;
        return this;
    }
    public String getStatesJson() {
        return this.statesJson;
    }

    public ListScriptRecordingRequest setUuidsJson(String uuidsJson) {
        this.uuidsJson = uuidsJson;
        return this;
    }
    public String getUuidsJson() {
        return this.uuidsJson;
    }

}
