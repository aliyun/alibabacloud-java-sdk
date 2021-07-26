// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentResponseBody extends TeaModel {
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
    public Long version;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Content")
    public String content;

    @NameInMap("Options")
    public String options;

    public static GetExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResponseBody self = new GetExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExperimentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetExperimentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetExperimentResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetExperimentResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public GetExperimentResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetExperimentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetExperimentResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
