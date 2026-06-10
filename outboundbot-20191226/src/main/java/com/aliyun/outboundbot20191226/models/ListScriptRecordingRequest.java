// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptRecordingRequest extends TeaModel {
    /**
     * <p>Instance ID of the recording</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c209abb3-6804-4a75-b2c7-dd55c8c61b6a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Recording ID list (JSON format), same as UuidsJson</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d9fad189-760b-47b9-837f-aeabb4fc9109\&quot;]</p>
     */
    @NameInMap("RefIdsJson")
    public String refIdsJson;

    /**
     * <p>Scenario ID of the recording</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Search criteria: Search by recording name or content.</p>
     * 
     * <strong>example:</strong>
     * <p>您好</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <p>Recording status</p>
     * <ul>
     * <li><p>Validating: 1</p>
     * </li>
     * <li><p>Validation failed: 2</p>
     * </li>
     * <li><p>Processing: 3</p>
     * </li>
     * <li><p>Processing failed: 4</p>
     * </li>
     * <li><p>Reviewing: 5</p>
     * </li>
     * <li><p>Review failed: 6</p>
     * </li>
     * <li><p>Publish failed: 7</p>
     * </li>
     * <li><p>Published: 8</p>
     * </li>
     * <li><p>Pending publish: 9</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *      &quot;8&quot;
     * ]</p>
     */
    @NameInMap("StatesJson")
    public String statesJson;

    /**
     * <p>Recording ID list</p>
     * <blockquote>
     * <p>This is a list of unique recording IDs. If left blank, all recordings display.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d17d5bfa-4972-4389-9718-f9602edabe48&quot;]</p>
     */
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

    public ListScriptRecordingRequest setRefIdsJson(String refIdsJson) {
        this.refIdsJson = refIdsJson;
        return this;
    }
    public String getRefIdsJson() {
        return this.refIdsJson;
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
