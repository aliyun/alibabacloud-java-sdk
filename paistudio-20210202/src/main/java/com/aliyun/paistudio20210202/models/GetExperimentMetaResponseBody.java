// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Source")
    public String source;

    @NameInMap("Version")
    public String version;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Options")
    public String options;

    public static GetExperimentMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentMetaResponseBody self = new GetExperimentMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentMetaResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentMetaResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExperimentMetaResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentMetaResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetExperimentMetaResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetExperimentMetaResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetExperimentMetaResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentMetaResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetExperimentMetaResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetExperimentMetaResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
